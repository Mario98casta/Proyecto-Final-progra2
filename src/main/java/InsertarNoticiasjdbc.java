/*import model.Noticias;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;*/

import model.Noticias;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class InsertarNoticiasjdbc {

    /* insertar Noticias desde json*/
  /* public static  void insertar() {
      //datos para conectar mysql
        String url= "jdbc:mysql://localhost:3306/noticias?severTimezone=UTC";
        String username= "root";
        String password = "root";

        //cargo noticias a un array list desde el documento json
        ArrayList<Noticias> noticias;
        noticias = new ArrayList<Noticias>();
        File file = new File("C:\\Users\\Fernando\\OneDrive\\Escritorio\\prograll\\proyecto final prograll\\world.json");
        //verificar si el archivo existe para leerlo
        if (file.exists()){
            System.out.println("el archivo existe");
            JSONParser parser= new JSONParser();
            try {
                Object obj = parser.parse(new FileReader("C:\\Users\\Fernando\\OneDrive\\Escritorio\\prograll\\proyecto final prograll\\world.json"));
                //se almacena en objeto joson
                JSONObject jsonObject = (JSONObject) obj;

                //extraer la lista json del objeto
                JSONArray noticiasArray =(JSONArray)  jsonObject.get("results");

                for (int i=0; i< 30;i++){
                    Noticias noti = new Noticias();
                    //se extrae json del array
                    Object objetoNoticia = noticiasArray.get(i);
                    JSONObject objetoNoticiaJSON = (JSONObject) objetoNoticia;
                    //rellenar datos
                    noti.setTitle(objetoNoticiaJSON.get("title").toString());
                    noti.setTexto(objetoNoticiaJSON.get("abstract").toString());
                    noti.setByline(objetoNoticiaJSON.get("byline").toString());
                    noti.setUrl(objetoNoticiaJSON.get("url").toString());
                    //añado al arrray list global
                    noticias.add(noti);

                }

            } catch (FileNotFoundException ex ){
                System.out.println("error al leer archivo de clientes(FNF)"+ex.toString());
            } catch (IOException e){
                System.out.println("error al leer archivo de Noticias (IOE)"+e.toString());

            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }//FIN DE IF

        try {
            //metodo para insertar los datos a mysql
            String sql;
            sql="insert into noticias(title,abstract,byline,url) values(?,?,?,?)" ;

            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            for (Noticias N:noticias){

                preparedStatement.setString(1,N.getTitle());
                preparedStatement.setString(2,N.getTexto());
                preparedStatement.setString(3,N.getByline());
                preparedStatement.setString(4,N.getUrl());
                preparedStatement.executeUpdate();
            }
            connection.close();
            preparedStatement.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }//fin de insertar*/



}
