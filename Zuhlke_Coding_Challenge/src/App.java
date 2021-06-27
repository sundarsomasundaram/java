import com.opencsv.bean.CsvToBeanBuilder;
import com.zuhlke.storage.obj.Store;
import com.zuhlke.storage.service.Service;
import com.zuhlke.storage.utils.logs.LocalLogger;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;


// assumes the current class is called MyLogger

public class App {
    private final static Logger LOGGER = LocalLogger.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception {
        new Service().create(new App().processInput("D:\\Career\\zuhlke_coding_challenge\\zuhlke-coding-challenge\\sales.csv"));
    }

    private List<Store> processInput(String inputFilePath) throws IOException {
        List<Store> beans = null;
        beans = new CsvToBeanBuilder(new FileReader(inputFilePath))
                .withType(Store.class)
                .build()
                .parse();
        return beans;
    }


}
