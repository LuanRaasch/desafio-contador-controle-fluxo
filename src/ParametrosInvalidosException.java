public class ParametrosInvalidosException extends Exception{
   int parametroUm;
   int parametroDois;
public ParametrosInvalidosException(String message, int parametroUm, int parametroDois) {
    super(message);
    this.parametroUm = parametroUm;
    this.parametroDois = parametroDois;
}
}
