public class happyNumber {
    public boolean isHappy(int n) {
        int sum = 0;
        if(n/10 == 0){
            if(n%10 == 1 || n%10==7) return true;
            else return false;
        }
        while(n/10 > 0){
            int digit = n%10;
            sum += digit*digit;
            n=n/10;
        }
        sum += n*n;

        return isHappy(sum);
    }
}
