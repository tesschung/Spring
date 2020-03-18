package testPjt;
import org.springframework.context.support.GenericXmlApplicationContext;

public class mainClass {

    public static void main(String[] args) {
        // 기존 자바에서 사용하던 방법
        // TransportationWalk transportationWalk = new TransportationWalk();
        // transportationWalk.move();

        // 스프링에서 사용하는 방법
        // 1. GenericXmlApplicationContext를 가져온다.
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

        // 2. ctx의 bean에 접근해서 클래스를 가져오고, 클래스를 사용
        TransportationWalk transportationWalk =
        ctx.getBean("tWalk", TransportationWalk.class);
        transportationWalk.move();

        // 3. close() 한다.
        ctx.close();
    }
}
