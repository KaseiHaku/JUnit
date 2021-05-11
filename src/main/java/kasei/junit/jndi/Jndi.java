package kasei.junit.jndi;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * JNDI: 主要作用是从 .properties, .xml, .ini 文件中获取配置属性，而不用自己写代码解析文件
 */
@Slf4j
public class Jndi {
    
    public void getJndiProp(String jndiKey) throws NamingException {
        log.error("JNDI Demo");
        
        System.out.println(System.getProperty("user.dir")); // jndi.properties 只会在这个目录下找
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));


        InitialContext jndiCtx = new InitialContext();
        //String jndiKey = (String)jndiCtx.lookup("jndiKey");
        String defaultKey = (String)jndiCtx.lookup("defaultKey");
        String rootKey = (String)jndiCtx.lookup("root.rootKey");
        String jdbcUrl = (String)jndiCtx.lookup("db.datasource.jdbc.url");
        //System.out.println(jndiKey);
        System.out.println(rootKey);
        System.out.println(defaultKey);
        System.out.println(jdbcUrl);
        
    }

    public static void main(String[] args) throws NamingException {
        new Jndi().getJndiProp("");
    }
    
}
