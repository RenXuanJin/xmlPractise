import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.XML;
import org.junit.Test;

import java.io.*;

public class xmlPractise {
    @Test
    public void xmlPractiseTest() throws IOException {

        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("score");
        String s = IOUtils.toString(inputStream,"UTF-8");
        JSONObject jsonObject = XML.toJSONObject(s);
        JSONObject student1 = jsonObject.getJSONObject("student");
        String string = student1.toString();
        System.out.println(string);
        Student student = JSON.parseObject(string, Student.class);
        System.out.println(student);

    }
}
