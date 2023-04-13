package animal;

public class Quote {
	public static String getQuote() {
		String[] quotes = {"Curiosity killed the cat.", "If man could be crossed with a cat, it would improve the man " +
				"but deteriorate the cat.", "A dog will flatter you, but you have to flatter the cat.",  "I have lived" +
				" with several Zen masters — all of them cats.", "Cats will outsmart dogs every time.", "I have studied" +
				" many philosophers and many cats. The wisdom of cats is infinitely superior.", "In ancient times, cats" +
				" were worshipped as gods; they have not forgotten this.", "Cats have it all: admiration, an endless" +
				" sleep and company only when they want it.", "Dogs have owners, cats have staff."};
		int randomIndex = (int) (Math.random() * quotes.length);
		return quotes[randomIndex];
	}
}
