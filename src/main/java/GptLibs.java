import com.theokanning.openai.completion.chat.*;
import com.theokanning.openai.service.OpenAiService;

import java.util.ArrayList;
import java.util.List;

public class GptLibs {
    public static String genStory() {

        OpenAiService service = new OpenAiService(Auth.token);

//        chat context
        List<ChatMessage> messages = new ArrayList<>();

        ChatMessage userMessage = new ChatMessage(ChatMessageRole.USER.value(), "Write a story in a single paragraph and in mad libs style, replace one noun, one adj, one adv and one verb with '%s' and in that order");
        messages.add(userMessage);

//        api options
        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest
                .builder()
                .model("gpt-3.5-turbo-0613")
                .messages(messages)
                .maxTokens(256)
                .build();

//        get response
        ChatMessage responseMessage = service.createChatCompletion(chatCompletionRequest).getChoices().get(0).getMessage();

        return responseMessage.getContent();
    }
}
