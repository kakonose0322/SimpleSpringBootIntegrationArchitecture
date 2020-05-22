package com.zwp.simpleboot.websocket;

import lombok.Data;
import javax.websocket.Session;

/**
 * @author zwp
 * @create 2020-05-20 14:28
 * @deprecated 辅助类 WebSocket客户端连接
 */
@Data
public class WebSocketClient {
    // 与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;
    //连接的uri
    private String uri;
}
