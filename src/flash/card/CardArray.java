/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flash.card;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author guoshaoyuan
 */
public class CardArray
{
    private ArrayList<Card> cardList = new ArrayList<Card>();
    private ArrayList<Card> completed = new ArrayList<Card>();
    private ArrayList<Card> random = new ArrayList<Card>();
    private String source;
    private int num;
    
    public CardArray(String source, int num)
    {
        this.source = source;
        this.num = num;
    }

    public CardArray(ArrayList<Card> cardList, String source)
    {
        this.cardList = cardList;
        this.source = source;
    }
    
    public void add(Card card)
    {
        cardList.add(card);
        random.add(card);
    }
    
    public Card get(int i)
    {
        return cardList.get(i);
    }
    
    public Card getInRandom(int i)
    {
        return random.get(i);
    }
    
    public String print()
    {
        if(cardList.isEmpty())
        {
            return "Empty.";
        }
        String result = "";
        for(int i=0; i<cardList.size(); i++)
        {
            result = result + cardList.get(i).printCard();
        }
        return result;
    }
    
    public int size()
    {
        return cardList.size();
    }
    
    public ArrayList<Card> getRandom()
    {
        return random;
    }
    
    public void setRandom()
    {
        Collections.shuffle(random);
    }
    
    public void clear()
    {
        cardList.clear();
        completed.clear();
        random.clear();
    }
}
