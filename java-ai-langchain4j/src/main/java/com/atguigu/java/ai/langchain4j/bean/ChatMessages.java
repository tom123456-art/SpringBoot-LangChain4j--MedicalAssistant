package com.atguigu.java.ai.langchain4j.bean;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("chat_messages") //映射到MongoDB的chat_messages集合
public class ChatMessages {
    //唯一标识,映射到 MongoDB 文档的 _id 字段
    @Id
    private ObjectId messageId;
//    private Long messageId;
    private String memoryId;

    private String content; //存储当前聊天记录列表的json字符串
}