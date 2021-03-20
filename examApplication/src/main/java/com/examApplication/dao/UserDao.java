package com.examApplication.dao;

import com.examApplication.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();

        try (Connection connection = DBConnectionPool.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from users")){

            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setRequestDateTime(resultSet.getDate("request_date_time"));
                user.setName(resultSet.getString("name"));
                user.setBirthYear(resultSet.getDate("birth_year"));
                user.setGender(resultSet.getString("gender"));
                users.add(user);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return users;
    }

    public User addUser(User user){
        User user1 = new User();
        String sql = "insert into users(request_date_time, name, birth_year, gender) values(now(), ?, ?, ?)";

        try(Connection connection = DBConnectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, user1.getName());
            preparedStatement.setDate(2, (java.sql.Date) user.getBirthYear());
            preparedStatement.setString(3, user.getGender());
            preparedStatement.execute();


        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }return null;
    }

    //  запрос по имени
    public List<User> getUserByName(String name){
        List<User> users = new ArrayList<>();
        String sql = "select * from users where name = ?";

        try (Connection connection = DBConnectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setRequestDateTime(resultSet.getDate("request_date_time"));
                user.setName(resultSet.getString("name"));
                user.setBirthYear(resultSet.getDate("birth_year"));
                user.setGender(resultSet.getString("gender"));
                users.add(user);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }return users;
    }

    //  запрос по дате рождении
    public List<User> getUserByBirthDate(Date birthDate){
        List<User> users = new ArrayList<>();
        String sql = "select * from users where birth_year = ?";

        try (Connection connection = DBConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setDate(1, birthDate);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setRequestDateTime(resultSet.getDate("request_date_time"));
                user.setName(resultSet.getString("name"));
                user.setBirthYear(resultSet.getDate("birth_year"));
                user.setGender(resultSet.getString("gender"));
                users.add(user);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }return users;
    }

    //  запрос по гендеру
    public List<User> getUserByGender(String gender){
        List<User> users = new ArrayList<>();
        String sql = "select * from users where gender = ?";

        try (Connection connection = DBConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, gender);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setRequestDateTime(resultSet.getDate("request_date_time"));
                user.setName(resultSet.getString("name"));
                user.setBirthYear(resultSet.getDate("birth_year"));
                user.setGender(resultSet.getString("gender"));
                users.add(user);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }return users;
    }

    //  все запросы по времени запроса
    public List<User> getAllRequest(Date requestDateTime){
        List<User> requests = new ArrayList<>();
        String sql = "select * from users where extract (year from request_date_time) between ? and ?";

        try (Connection connection = DBConnectionPool.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

             preparedStatement.setDate(1, requestDateTime);
             preparedStatement.setDate(2, requestDateTime);
             ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                User userReq = new User();
                userReq.setId(resultSet.getLong("id"));
                userReq.setRequestDateTime(resultSet.getDate("requestDateTime"));
                userReq.setName(resultSet.getString("name"));
                userReq.setBirthYear(resultSet.getDate("birth_year"));
                userReq.setGender(resultSet.getString("gender"));
                requests.add(userReq);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }return requests;
    }

    //  удаление запросов
    public void deleteRequestById(Long userId){
        String sql = "delete from users where id = ?";

        try (Connection connection = DBConnectionPool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setLong(1, userId);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
