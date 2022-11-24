package db;

import java.sql.*;

public class GaragePreparedStantment {


    Connection conn = null;


    public GaragePreparedStantment() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void insertCar(String plate, String type, String producer) {
        PreparedStatement st = null;
        Regex regex = new Regex();
        if (regex.isCheck(plate)) {

            int ri = 0;
            String query = "INSERT INTO veicolo VALUES(?,?,?)";
            try {
                st = conn.prepareStatement(query);
                st.setString(1, plate);
                st.setString(2, type);
                st.setString(3, producer);

                ri = st.executeUpdate();
                System.out.printf("righe inserite = %s", ri);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("plate not valid");
        }
    }


    public void showGarage(String column, String plate) {

        ResultSet rs = null;
        String query = "SELECT # FROM veicolo WHERE plate=?";
        if (column.equalsIgnoreCase("")) {
            query = query.replace("#", "*");
        } else {
            query = query.replace("#", column);
        }
        PreparedStatement st = null;

        try {


            if (column.equalsIgnoreCase("*")) {
                query = query.replace(" WHERE plate=?", "");
                System.out.println(query);
            } else {
                st.setString(1, plate);
            }
            st = conn.prepareStatement(query);
            rs = st.executeQuery();
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
            String query = "DELETE FROM veicolo WHERE plate=?";
            PreparedStatement st = null;

            try {
                st = conn.prepareStatement(query);
                st.setString(1, value);
                rd = st.executeUpdate();

                System.out.printf("righe cancellate = %s", rd);


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void upDateCar(String updateColumn, String value, String plate) {
        Regex regex = new Regex();
        if (regex.isCheck(plate)) {
            PreparedStatement st = null;
            int rm = 0;
            String query = String.format("UPDATE veicolo SET %s=? WHERE plate=?", updateColumn);
            //inserisce colonna
            //query.replace("#","nome_colonna");
            try {
                st = conn.prepareStatement(query);

                st.setString(1, value);
                st.setString(2, plate);
                rm = st.executeUpdate();
                System.out.printf("righe modificate = %s", rm);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("plate not valid");
        }
    }


}
