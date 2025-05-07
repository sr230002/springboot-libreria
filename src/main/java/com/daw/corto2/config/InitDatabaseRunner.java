// package com.daw.corto2.config;

// import java.sql.Connection;
// import java.sql.Statement;

// import javax.sql.DataSource;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.ApplicationArguments;
// import org.springframework.boot.ApplicationRunner;
// import org.springframework.stereotype.Component;

// @Component
// public class InitDatabaseRunner implements ApplicationRunner {

//     @Autowired
//     private DataSource dataSource;

//     @Override
//     public void run(ApplicationArguments args) throws Exception {
//         try (Connection conn = dataSource.getConnection()) {
//             String sql = new String(
//                 getClass().getClassLoader().getResourceAsStream("init.sql").readAllBytes()
//             );
//             try (Statement stmt = conn.createStatement()) {
//                 stmt.execute(sql);
//             }
//         }*/
//     }
// }

