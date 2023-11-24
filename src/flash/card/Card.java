/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flash.card;

/**
 *
 * @author guoshaoyuan
 */
public class Card
{
    private String kanji;
    private String word;
    private String translation;

    public Card(String kanji, String word, String translation)
    {
        this.kanji = kanji;
        this.word = word;
        this.translation = translation;
    }

    public String getKanji()
    {
        return kanji;
    }

    public void setKanji(String kanji)
    {
        this.kanji = kanji;
    }

    
    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getTranslation()
    {
        return translation;
    }

    public void setTranslation(String translation)
    {
        this.translation = translation;
    }
 
    public String printCard()
    {
        return kanji + " " + word + " "+ translation + "\n";
    }
}
