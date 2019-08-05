package LinkDatabase.LinkMySQL.LinkTool;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class LinkMySQL8_0_16Test {

    private LinkMySQL8_0_16 linkMySQL8_0_16;

    public LinkMySQL8_0_16 getLinkMySQL8_0_16() {
        return linkMySQL8_0_16;
    }

    public void setLinkMySQL8_0_16(LinkMySQL8_0_16 linkMySQL8_0_16) {
        this.linkMySQL8_0_16 = linkMySQL8_0_16;
    }

    @BeforeEach
    void setUp() throws SQLException, ClassNotFoundException {
        this.linkMySQL8_0_16 = new LinkMySQL8_0_16();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getConnection() {
        if (this.getLinkMySQL8_0_16().getConnection()!=null) {
            System.out.println("连接成功！");
        } else {
            System.out.println("连接失败！");
        }
    }

}