
import java.util.Random;
public class ShuffleCards {
    /*
    一种O(n)的洗牌算法
     */
    public static  void shuffle(int [] cards){
        if (cards==null||cards.length==0){
            return ;
        }
        Random random=new Random();
        for (int i=cards.length;i>0;i--){
            int r=random.nextInt(i);
            int tmp=cards[i-1];
            cards[i-1]=cards[r];
            cards[r]=tmp;
        }

    }

    public static void main(String[] args) {
        int [] cards={1,2,3,4,5};
        shuffle(cards);
        for (int i:cards){
            System.out.println(i);
        }
    }

}
