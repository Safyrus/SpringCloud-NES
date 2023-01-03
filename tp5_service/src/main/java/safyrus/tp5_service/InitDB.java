package safyrus.tp5_service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class InitDB implements CommandLineRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Init DB...");

        String sqlStrings[] = {
            "drop table nesgame if exists;",
            "create table nesgame(serialid serial, id varchar(255), name varchar(255));",
            "insert into nesgame (id, name) values ('HVC-SM', 'Super Mario Bros.');",
            "insert into nesgame (id, name) values ('NES-ZL-USA', 'Legend of Zelda, The');",
            "insert into nesgame (id, name) values ('NES-KR-USA', 'Kirby s Adventure');",
            "insert into nesgame (id, name) values ('SAF-RF-USA', 'Reflexion');",
            "insert into nesgame (id, name) values ('NES-QP-USA', 'Punch-Out!!');"
        };

        Arrays.asList(sqlStrings).stream().forEach(sql -> {
            System.out.println(sql);
            jdbcTemplate.execute(sql);
        });

        System.out.println("DB content:");
        jdbcTemplate.query("select * from nesgame",
            new RowMapper<Object>() {
                @Override
                public Object mapRow(ResultSet nesgame, int i) throws SQLException {
                    System.out.println(
                        " serialid:" + nesgame.getString("serialid") +
                        " id:" + nesgame.getString("id") +
                        " name:" + nesgame.getString("name")
                    );
                    return null;
                };
            }
        );

        System.out.println("Done.");
    }
    
}
