package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class QueryStringsTest {
    @Test
    void createTest() {
        QueryStrings queryStrings = new QueryStrings("/calculate?operand1=11&operator=*&operand2=55"); // List<QueryString>
        assertThat(queryStrings).isNotNull();
    }
}
