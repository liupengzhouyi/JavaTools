package LinkDatabase.LinkMySQL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SelectDataTest {

    private String sql = "select * from nameAndAge;";

    private SelectData selectData;

    @BeforeEach
    void setUp() throws SQLException, ClassNotFoundException {
        selectData = new SelectData(this.getSql());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getResultSet() throws SQLException {
        ResultSet resultSet = this.getSelectData().getResultSet();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            System.out.println(name);
        }

    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SelectData getSelectData() {
        return selectData;
    }

    public void setSelectData(SelectData selectData) {
        this.selectData = selectData;
    }
}