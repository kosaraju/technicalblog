package technicalblog.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public PostService() {
        System.out.println("Post Service created");
    }

    @PersistenceUnit(unitName = "techblog")
    private EntityManagerFactory emf;
    public List<Post> getAllPosts() {

        //ArrayList<Post> posts = new ArrayList();
//        Post post1 = new Post();
//        post1.setTitle("Post 1");
//        post1.setBody("Post Body 1");
//        post1.setDate(new Date());
//
//        Post post2 = new Post();
//        post2.setTitle("Post 2");
//        post2.setBody("Post Body 2");
//        post2.setDate(new Date());
//
//        Post post3 = new Post();
//        post3.setTitle("Post 3");
//        post3.setBody("Post Body 3");
//        post3.setDate(new Date());
//        posts.add(post1);
//        posts.add(post2);
//        posts.add(post3);

//        Connection connection = null;
//        ArrayList<Post> posts = new ArrayList<>();
//        try{
//            Class.forName("org.postgresql.Driver");
//
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:54321/technicalblog","postgres", "postgres");
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM posts");
//            while(rs.next()){
//                Post post = new Post();
//                post.setTitle(rs.getString("title"));
//                post.setBody(rs.getString("body"));
//                posts.add(post);
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        EntityManager em = emf.createEntityManager();
        TypedQuery<Post> query = em.createQuery("SELECT p from Post p", Post.class);
        List<Post> resultList = query.getResultList();

        return resultList;

    }

    public List<Post> getOnePost() {

//        ArrayList<Post> posts = new ArrayList();
//        Post post1 = new Post();
//        post1.setTitle("User Post 1");
//        post1.setBody("User Post Body 1");
//        post1.setDate(new Date());
//        posts.add(post1);
//        return posts;

//        Connection connection =null;
//        ArrayList<Post> posts = new ArrayList<>();
//        try{
//            Class.forName("org.postgresql.Driver");
//
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:54321/technicalblog","postgres", "postgres");
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM posts where id = 3");
//            while(rs.next()){
//                Post post = new Post();
//                post.setTitle(rs.getString("title"));
//                post.setBody(rs.getString("body"));
//                posts.add(post);
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return posts;

        EntityManager em = emf.createEntityManager();
        TypedQuery<Post> query = em.createQuery("SELECT p from Post p", Post.class);
        List<Post> resultList = query.getResultList();

        return resultList;

    }

    public void createPost (Post newPost){

    }
}
