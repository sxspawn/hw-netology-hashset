import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et
                dolore magna aliqua. Orci sagittis eu volutpat odio facilisis. Nisi porta lorem mollis aliquam ut
                porttitor leo a diam. Rhoncus mattis rhoncus urna neque. Id leo in vitae turpis. Cursus mattis molestie
                a iaculis at erat pellentesque adipiscing commodo. Risus sed vulputate odio ut. Tellus elementum
                sagittis vitae et leo duis. Ac turpis egestas sed tempus urna. Posuere ac ut consequat semper viverra
                nam libero justo laoreet. Turpis egestas sed tempus urna et pharetra pharetra massa massa. Ultrices dui
                sapien eget mi. Convallis convallis tellus id interdum. Enim nunc faucibus a pellentesque sit amet.
                Nunc congue nisi vitae suscipit tellus mauris a diam maecenas. Amet justo donec enim diam vulputate.
                Ullamcorper malesuada proin libero nunc consequat interdum varius sit amet. Commodo nulla facilisi
                nullam vehicula ipsum a arcu.
                                                            
                Consectetur libero id faucibus nisl tincidunt. Porta lorem mollis aliquam ut porttitor leo a diam. Metus
                dictum at tempor commodo ullamcorper a lacus vestibulum sed. Rhoncus mattis rhoncus urna neque. Consequat
                ac felis donec et. Arcu cursus vitae congue mauris rhoncus aenean vel. Feugiat sed lectus vestibulum
                mattis. Lobortis scelerisque fermentum dui faucibus. Vestibulum rhoncus est pellentesque elit ullamcorper
                dignissim cras tincidunt. Sollicitudin aliquam ultrices sagittis orci a scelerisque.
                                          
                Amet est placerat in egestas erat imperdiet sed. Adipiscing tristique risus nec feugiat in fermentum
                posuere urna nec. Accumsan lacus vel facilisis volutpat est. Ac placerat vestibulum lectus mauris ultrices
                eros in. Amet purus gravida quis blandit turpis. Netus et malesuada fames ac turpis egestas sed tempus.
                Venenatis urna cursus eget nunc scelerisque viverra mauris. Lacinia at quis risus sed vulputate odio ut.
                Est pellentesque elit ullamcorper dignissim cras. Elit sed vulputate mi sit amet mauris commodo quis.
                                                            
                Massa tincidunt dui ut ornare. Bibendum arcu vitae elementum curabitur vitae. In egestas erat imperdiet
                sed euismod nisi porta. Proin sed libero enim sed faucibus turpis in eu. Eget est lorem ipsum dolor sit
                amet consectetur. Fermentum dui faucibus in ornare quam viverra orci sagittis. Quam elementum pulvinar
                etiam non quam lacus suspendisse faucibus. Est ultricies integer quis auctor elit. Nisi porta lorem mollis
                aliquam ut porttitor leo. Blandit turpis cursus in hac habitasse platea dictumst quisque sagittis. Sit
                amet nisl suscipit adipiscing bibendum est ultricies. Luctus venenatis lectus magna fringilla urna
                porttitor. Laoreet sit amet cursus sit amet dictum sit amet justo. Urna et pharetra pharetra massa massa
                ultricies mi quis. Arcu cursus euismod quis viverra nibh. Purus semper eget duis at tellus. Adipiscing
                vitae proin sagittis nisl rhoncus mattis rhoncus.
                                                            
                Turpis nunc eget lorem dolor sed viverra ipsum nunc aliquet. Vel turpis nunc eget lorem. Quam quisque id
                diam vel quam elementum. Etiam tempor orci eu lobortis. Sit amet consectetur adipiscing elit duis
                tristique sollicitudin nibh. Elit duis tristique sollicitudin nibh sit amet. Nisi quis eleifend quam
                adipiscing vitae. Leo in vitae turpis massa sed. Diam quam nulla porttitor massa id neque aliquam. Mattis
                molestie a iaculis at erat pellentesque. Quis vel eros donec ac. A lacus vestibulum sed arcu non odio
                euismod lacinia at. Neque ornare aenean euismod elementum nisi quis eleifend quam adipiscing. Risus
                feugiat in ante metus dictum at. Gravida arcu ac tortor dignissim convallis. Volutpat lacus laoreet non
                curabitur gravida arcu ac. At urna condimentum mattis pellentesque id. Sit amet facilisis magna etiam.
                Egestas purus viverra accumsan in nisl nisi scelerisque. Venenatis a condimentum vitae sapien pellentesque
                habitant morbi tristique.""";


        WordsChecker wordsChecker = new WordsChecker(text);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для проверки: ");
        String word = scanner.nextLine();

        if (wordsChecker.hasWord(word)) {
            System.out.println("Слово \"" + word + "\" найдено в тексте.");
        } else {
            System.out.println("Слово \"" + word + "\" не найдено в тексте.");
        }
    }
}