/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import static com.impossibl.postgres.protocol.ServerObjectType.Statement;
import java.beans.Statement;
import java.sql.Connection;

/**
 *
 * @author Erick Contreras
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/*Desde aca se manda la Alerta*/
import java.sql.Connection;
import java.sql.SQLException;


/*Desde aca se manda la Alerta*/
public class Notificador extends Thread {

    private Connection C1;

    public Notificador(Connection conn) {
        this.C1 = conn;
    }

    public void run() {
        while (true) {
            try {
                java.sql.Statement stmt = C1.createStatement();
                stmt.execute("NOTIFY mymessage");
                stmt.close();
                Thread.sleep(2000);
            } catch (SQLException | InterruptedException sqle) {
                sqle.printStackTrace();
            }
        }
    }
}

