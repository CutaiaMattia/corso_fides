package db;

import java.sql.*;

public class Garage {


    Connection conn = null;


    public Garage() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void insertCar(String plate, String type, String producer) {
        Statement st = null;
        Regex regex = new Regex();
        if (regex.isCheck(plate)) {

            int ri = 0;
            String query = String.format("INSERT INTO veicolo VALUES('%s','%s','%s')", plate, type, producer);
            try {
                st = conn.createStatement();
                ri = st.executeUpdate(query);
                System.out.printf("righe inserite = %s", ri);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("plate not valid");
        }
    }


    public void showGarage() {

        ResultSet rs = null;
        String query = "SELECT * FROM veicolo";
        Statement st = null;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i));
                }
                System.out.println();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(String value) {
        Regex regex = new Regex();
        if (regex.isCheck(value)) {
            int rd = 0;
            String query = String.format("DELETE FROM veicolo WHERE plate='%s'", value);
            Statement st = null;

            try {
                st = conn.createStatement();
                rd = st.executeUpdate(query);

                System.out.printf("righe cancellate = %s", rd);


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void upDateCar(String updateColumn, String value, String plate) {
        Regex regex = new Regex();
        System.out.println(regex.isCheck(value));
                if (regex.isCheck(plate)) {
                    Statement st = null;
                    int rm = 0;
                    String query = String.format("UPDATE veicolo SET %s='%s' WHERE plate='%s'", updateColumn, value, plate);
                    try {
                        st = conn.createStatement();
                        rm = st.executeUpdate(query);
                        System.out.printf("righe modificate = %s", rm);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("plate not valid");
                }
            }


}
