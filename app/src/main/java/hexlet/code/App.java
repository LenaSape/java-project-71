package hexlet.code;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

//@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "1.0",
  //      description = "Compares two configuration files and shows a difference.")
@Command(name = "gendiff", mixinStandardHelpOptions = true,
        description = "Compares two configuration files and shows a difference.")
class Gendiff implements Callable<Integer> {

    //@Parameters(index = "0", description = "The file whose checksum to calculate.")
    //private File file;

    //@Option(names = {"-a", "--algorithm"}, description = "MD5, SHA-1, SHA-256, ...")
    //private String algorithm = "SHA-256";

    //@Option(names = {"-h", "--help"}, description = "Show this help message and exit.", help=true)
    //boolean help;

    //@Option(names = {"-u", "--user"}, description = "User name")
    //String user;

    //@Option(names = {"-V", "--version"}, description = "Print version information and exit.")
    //String version;


    @Override
    public Integer call() throws Exception { // your business logic goes here...
        //byte[] fileContents = Files.readAllBytes(file.toPath());
        //byte[] digest = MessageDigest.getInstance(algorithm).digest(fileContents);
        //System.out.printf("%0" + (digest.length * 2) + "x%n", new BigInteger(1, digest));
        return 0;
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //int exitCode = new CommandLine(new CheckSum()).execute(args);
        var cl = CommandLine.populateCommand(new Gendiff(), args);
        //System.out.println(cl.help);
        CommandLine.usage(cl, System.out, CommandLine.Help.Ansi.AUTO);
        //Differ.generate();
    }
}