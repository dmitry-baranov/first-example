package errors;

public class MyException extends RuntimeException {

    private Response response;

    public MyException(Response response) {
        this.response = response;
    }

}
