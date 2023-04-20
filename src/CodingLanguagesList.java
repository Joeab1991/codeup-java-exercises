import java.util.ArrayList;
import java.util.Comparator;


public class CodingLanguagesList {
	public static void main(String[] args) {
		ArrayList<CodingLanguage> codingLanguages = new ArrayList<>();

		CodingLanguage java = new CodingLanguage("Java", 1995, "Sun Microsystems");
		codingLanguages.add(java);

		CodingLanguage python = new CodingLanguage("Python", 1991, "Guido van Rossum");
		codingLanguages.add(python);

		CodingLanguage javascript = new CodingLanguage("JavaScript", 1995, "Netscape Communications Corporation");
		codingLanguages.add(javascript);

		CodingLanguage c = new CodingLanguage("C", 1972, "Dennis Ritchie");
		codingLanguages.add(c);

		CodingLanguage cPlusPlus = new CodingLanguage("C++", 1983, "Bjarne Stroustrup");
		codingLanguages.add(cPlusPlus);

		CodingLanguage go = new CodingLanguage("Go", 2009, "Google");
		codingLanguages.add(go);

		CodingLanguage swift = new CodingLanguage("Swift", 2014, "Apple Inc.");
		codingLanguages.add(swift);

		CodingLanguage rust = new CodingLanguage("Rust", 2010, "Mozilla Foundation");
		codingLanguages.add(rust);

		CodingLanguage kotlin = new CodingLanguage("Kotlin", 2011, "JetBrains");
		codingLanguages.add(kotlin);

		CodingLanguage ruby = new CodingLanguage("Ruby", 1995, "Yukihiro Matsumoto");
		codingLanguages.add(ruby);

		CodingLanguage php = new CodingLanguage("PHP", 1995, "Rasmus Lerdorf");
		codingLanguages.add(php);

		CodingLanguage objectiveC = new CodingLanguage("Objective-C", 1983, "Brad Cox");
		codingLanguages.add(objectiveC);

		CodingLanguage sql = new CodingLanguage("SQL", 1974, "IBM");
		codingLanguages.add(sql);

		CodingLanguage swiftObjectiveC = new CodingLanguage("Swift/Obj-C", 2014, "Apple Inc.");
		codingLanguages.add(swiftObjectiveC);

		CodingLanguage perl = new CodingLanguage("Perl", 1987, "Larry Wall");
		codingLanguages.add(perl);

		CodingLanguage groovy = new CodingLanguage("Groovy", 2003, "James Strachan");
		codingLanguages.add(groovy);

		CodingLanguage scala = new CodingLanguage("Scala", 2004, "Martin Odersky");
		codingLanguages.add(scala);

		CodingLanguage lua = new CodingLanguage("Lua", 1993, "Roberto Ierusalimschy");
		codingLanguages.add(lua);

		CodingLanguage r = new CodingLanguage("R", 1993, "Ross Ihaka and Robert Gentleman");
		codingLanguages.add(r);

		CodingLanguage clojure = new CodingLanguage("Clojure", 2007, "Rich Hickey");
		codingLanguages.add(clojure);

		CodingLanguage haskell = new CodingLanguage("Haskell", 1990, "Haskell Curry");
		codingLanguages.add(haskell);

		CodingLanguage erlang = new CodingLanguage("Erlang", 1986, "Joe Armstrong");
		codingLanguages.add(erlang);

		CodingLanguage elixir = new CodingLanguage("Elixir", 2011, "José Valim");
		codingLanguages.add(elixir);

		CodingLanguage holyC = new CodingLanguage("HolyC", 1991, "John Carmack");
		codingLanguages.add(holyC);

//		for (CodingLanguage codingLanguage : codingLanguages) {
//			System.out.printf("%s was created in %d by %s.%n", codingLanguage.getName(), codingLanguage.getCreatedDate(), codingLanguage.getCreator());
//		}

		codingLanguages.sort(Comparator.comparing(CodingLanguage::getName));

		System.out.println("Sorted by name:");
		for (CodingLanguage codingLanguage : codingLanguages) {
			System.out.printf("%s was created in %d by %s.%n", codingLanguage.getName(), codingLanguage.getCreatedDate(), codingLanguage.getCreator());
		}

		codingLanguages.sort(Comparator.comparing(CodingLanguage::getCreatedDate));

		System.out.println();
		System.out.println("Sorted by created date:");
		System.out.println();

		for (CodingLanguage codingLanguage : codingLanguages) {
			System.out.printf("%s was created in %d by %s.%n", codingLanguage.getName(), codingLanguage.getCreatedDate(), codingLanguage.getCreator());
		}


	}
}
