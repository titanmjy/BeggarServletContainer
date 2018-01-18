package com.ljm.server.protocol.http.parser;

/**
 * HTTP Message解析上下文
 *
 * @author 李佳明 https://github.com/pkpk1234
 */
public class HttpParserContext {

    private static final ThreadLocal<byte[]> HTTP_MESSAGE_BYTES = new ThreadLocal<>();
    private static final ThreadLocal<String> REQUEST_QUERY_STRING = new ThreadLocal<>();
    private static final ThreadLocal<Boolean> HAS_BODY = new ThreadLocal<>();
    private static final ThreadLocal<Integer> BYTES_LENGTH_BEFORE_BODY = new ThreadLocal<>();

    public static byte[] getHttpMessageBytes() {
        return HTTP_MESSAGE_BYTES.get();
    }

    public static void setHttpMessageBytes(byte[] iHttpMessageBytes) {
        HTTP_MESSAGE_BYTES.set(iHttpMessageBytes);
    }

    public static String getRequestQueryString() {
        return REQUEST_QUERY_STRING.get();
    }

    public static void setRequestQueryString(String iRequestQueryString) {
        REQUEST_QUERY_STRING.set(iRequestQueryString);
    }

    public static boolean getHasBody() {
        return HAS_BODY.get();
    }

    public static void setHasBody(boolean iHasBody) {
        HAS_BODY.set(iHasBody);
    }

    public static int getBytesLengthBeforeBody() {
        return BYTES_LENGTH_BEFORE_BODY.get();
    }

    public static void setBytesLengthBeforeBody(int iBytesLengthBeforeBody) {
        BYTES_LENGTH_BEFORE_BODY.set(iBytesLengthBeforeBody);
    }
}
