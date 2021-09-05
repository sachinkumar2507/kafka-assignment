import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
public class Producer {

    public static void main(String[] args) throws Exception{

        Properties props = new Properties();
        props.put("bootstrap.servers","localhost:9092");

        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        props.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        String topicname = "kafkademo";
        KafkaProducer kafkaProducer = new KafkaProducer(props);

        ProducerRecord producerRecord =new ProducerRecord(topicname,"{\"id\":\"1\",\"name\":\"sachin\",\"age\":\"24\",\"course\":\"BTech.\"}");
        kafkaProducer.send(producerRecord);
        //System.out.println("Message sent successfully");
        kafkaProducer.close();
    }
}