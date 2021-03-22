package main;

import sn.isi.dao.DB;
import sn.isi.dao.IUser;
import sn.isi.dao.UserImpl;
import sn.isi.entities.User;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        /*DB db = new DB();
        db.open();
        String sql = "INSERT INTO user VALUES(NULL, ?, ?, ?, ?)";
        db.init(sql);
        db.getPstm().setString(1, "SARR");
        db.getPstm().setString(2, "Amadou");
        db.getPstm().setString(3, "sarr0293@gmail.com");
        db.getPstm().setString(4, "7777777777");
        int ok = db.executeUpdate();
        System.out.println(ok);*/
        IUser userdao = new UserImpl();
        User user = new User();
        user.setNom("SARR");
        user.setPrenom("Pipita");
        user.setEmail("pipita0293@gmail.com");
        user.setPassword("777777777");

        int ok = userdao.add(user);
       // System.out.println(ok);
        List<User>users = userdao.getAll();
        for (User u : users){
            System.out.println("id : " + u.getId() + ", nom : " + u.getNom() + ", prenom : " + u.getPrenom() +
                    ", email : " + u.getEmail() + ", password : " + u.getPassword());
        }
    }
}
