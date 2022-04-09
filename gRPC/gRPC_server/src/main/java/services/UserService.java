package services;

import com.partho.grpc.LogInGrpc;
import com.partho.grpc.User;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.util.logging.Logger;



public class UserService extends LogInGrpc.LogInImplBase {


    private final String DB = "jdbc:mysql://localhost:3307/grpc";
    private final String userName = "root";
    private final String password = "";

    private Connection connection;
    private Statement statement;

        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(DB, userName, password);
                statement = connection.createStatement();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }


    private String sessionUsername = "";
    private static final Logger logger = Logger.getLogger(UserService.class.getName());


    @Override
    public void signUp(User.UserModel request, StreamObserver<User.APIResponse> responseObserver) {
        String firstName = request.getFirstName();
        String lastName = request.getLastName();
        String email = request.getEmail();
        String regPassword = request.getPassword();

        logger.info("Sign Up Request from user: "+firstName);

        User.APIResponse.Builder response = User.APIResponse.newBuilder();
        String query = "SELECT * FROM `sign_up` WHERE First_name = \""+firstName+"\";";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                response.setResponseCode(200).setResponseMessage("User exists!");
                logger.info("Sign Up failed for user : " + firstName);
            } else {
                query = "INSERT INTO sign_up(First_name, Last_name, Email, pass) " +
                        "VALUES(\""+firstName+"\", \""+lastName+"\", \""+email+"\", \""+regPassword+"\");";
                statement.executeUpdate(query);
                response.setResponseMessage("Success").setResponseCode(400);
                logger.info("Sign Up successful for user : " + firstName);
                sessionUsername = firstName;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {
        System.out.println("Logging in...");
        String username = request.getUsername();
        String password = request.getPassword();

        logger.info("Log In Request from user: "+username);

        User.APIResponse.Builder response = User.APIResponse.newBuilder();

        String query = "SELECT * FROM `sign_up` WHERE First_name = \""+username+"\" and pass = \""+password+"\";";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                response.setResponseMessage("Login Successful").setResponseCode(100);
                logger.info("Login successful for user : " + username);
                sessionUsername = username;

            } else{
                response.setResponseMessage("Login Failed").setResponseCode(400);
                logger.info("Login failed for user : " + username);

            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
