import model.Noticias;

import java.sql.*;
import java.util.ArrayList;

public class ObtenerNoticias {
        static ArrayList<Noticias> noticiasjdbs= new ArrayList<Noticias>();
    public static void Obtenerjdbs() {

        String url= "jdbc:mysql://localhost:3306/noticias?severTimezone=UTC";
        String username= "root";
        String password = "root";


        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM noticias");
            while(resultSet.next()){
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("title"));
                System.out.println(resultSet.getString("abstract"));
                System.out.println(resultSet.getString("byline"));
                System.out.println(resultSet.getString("url"));
                noticiasjdbs.add(new Noticias(resultSet.getString("id"),resultSet.getString("title"),resultSet.getString("abstract"),
                        resultSet.getString("byline"),resultSet.getString("url")));

            }

            connection.close();
            statement.close();
            resultSet.close();


        }catch (SQLException e){
            e.printStackTrace();

        }

    }//FIN DE OBTENER NOTICIAS


}
