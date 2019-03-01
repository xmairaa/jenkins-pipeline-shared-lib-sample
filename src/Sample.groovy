import com.ericsson.eiffel.fem.config.EiffelJenkinsGlobalConfiguration
import com.ericsson.eiffel.common.rest.ERClient

public class Sample {
    private int x;
    private int y;

    public Sample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public String toErClient() {
        final String erUrl = EiffelJenkinsGlobalConfiguration.get().getErRestUrl()
        println "ER URL ---------------------------------------"+erUrl
        return ERClient.getInstance(erUrl)
    }
}
