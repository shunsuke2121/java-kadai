public class MultiChecker {
    short arg;
    String check(short n){
        if (n%arg ==0){
            return arg+"の倍数である";
        }
        return  arg +"の倍数ではない";
    }
}
