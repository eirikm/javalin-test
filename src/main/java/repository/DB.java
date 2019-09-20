package repository;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import domain.Arrangement;
import domain.Arrangementer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.io.*;

public class DB {

    private static int CORALOGIX_COMPANY = 6804;
    private static String CORALOGIX_SUBSYSTEM_NAME = "backend";

    private static final Logger log = LoggerFactory.getLogger(DB.class);

    private static Sql2o sql2o;


    public static String saveFromKondis(int id) {
        try (Connection con = sql2o.open()) {
            String sql = "SELECT verdi FROM spike where id = :id";
            return con.createQuery(sql)
                    .addParameter("id", id)
                    .executeScalar(String.class);
        }
    }

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("/Users/christineteig/repos/ctekk/spike/javalin-test/resources/details.json")) {

            // Convert JSON File to Java Object
            Arrangementer arrangementer = gson.fromJson(reader, Arrangementer.class);

            // print staff
            System.out.println(arrangementer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
