import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;

@EnableBinding(MessageConsumer.MessageBinding.class)
public class MessageConsumer {

    interface MessageBinding {
        String INPUT = "input";

        @StreamListener(INPUT)
        void handleMessage(@Payload String message);
    }
}
