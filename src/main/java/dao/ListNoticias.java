package dao;

import model.Comentarios;
import model.Noticias;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//metodo para ver noticias
public class ListNoticias {
    public List<Noticias> getALLDB(){
        // ingreso a mysql
        String url= "jdbc:mysql://localhost:3306/noticias?severTimezone=UTC";
        String username= "root";
        String password = "root";
        List <Noticias> notitoons = new ArrayList<>();

        try{
                //coneccion y consulta a mysql
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM noticias");
                //obtener resultados de toda la base de datos con.next
            while (resultSet.next()){
                notitoons.add(new Noticias(resultSet.getString("id"),resultSet.getString("title"),resultSet.getString("abstract"),
                        resultSet.getString("byline"),resultSet.getString("url")));


            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }


        return notitoons;
    }





    public Noticias MostrarNoticia(int id){
        // ingreso a mysql
        String url= "jdbc:mysql://localhost:3306/noticias?severTimezone=UTC";
        String username= "root";
        String password = "root";
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Noticias noticias = null;

        try{
            //coneccion y selecion de noticia atravez del id
            Connection connection = DriverManager.getConnection(url,username,password);
            preparedStatement = connection.prepareStatement("SELECT id, title,abstract,byline,url FROM noticias WHERE id=?");
           preparedStatement.setInt(1,id);

            resultSet = preparedStatement.executeQuery();


            while (resultSet.next()){

                noticias= new Noticias(resultSet.getString("id"),resultSet.getString("title"),resultSet.getString("abstract"),
                        resultSet.getString("byline"),resultSet.getString("url"));


            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }


        return noticias;

    }


    public List<Comentarios> getALLDBS(){
        // ingreso a mysql
        String url= "jdbc:mysql://localhost:3306/noticias?severTimezone=UTC";
        String username= "root";
        String password = "root";
        List <Comentarios> comentoons = new ArrayList<>();

        try{
            // coneccion y obtencion de toda la base de datos
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM comentarios");

            while (resultSet.next()){
                comentoons.add(new Comentarios(resultSet.getString("idcomentarios"),resultSet.getString("nombre"),resultSet.getString("comentarios")));


            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }


        return comentoons;
    }




    public boolean insertar(Comentarios comentarios){
        // ingreso a mysql
        String url= "jdbc:mysql://localhost:3306/noticias?severTimezone=UTC";
        String username= "root";
        String password = "root";




        try{
            //metodo para registrar los comentarios ala pagina
            String sql;
            sql="insert into comentarios(idcomentarios,nombre,comentarios) values(?,?,?)" ;

            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement =connection.prepareStatement(sql);


                preparedStatement.setString(1,comentarios.getIdcomentarios());
                preparedStatement.setString(2,comentarios.getNombre());
                preparedStatement.setString(3,comentarios.getComentarios());

                //preparedStatement.executeUpdate();
               preparedStatement.execute() ;


            connection.close();
            preparedStatement.close();

            return true;

        }catch (SQLException throwables){
            throwables.printStackTrace();
            return false;
        }



    }//fin de insertar



}
