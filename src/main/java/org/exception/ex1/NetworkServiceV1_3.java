package org.exception.ex1;


public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "naver.com";
        NetworkClientV1 clientV0 = new NetworkClientV1(address);
        clientV0.initError(data);

        String result = clientV0.connect();
        if (isError(result)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + result);
        }else {
            String sendResult = clientV0.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
                return;
            }
        }

        clientV0.disconnect();

    }

    private static boolean isError(String result) {
        return !result.equals("success");
    }
}
