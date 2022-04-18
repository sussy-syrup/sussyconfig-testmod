package net.sussysyrup.testmod;

import com.sussysyrup.sussyconfig.ConfigManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("testmod");

	@Override
	public void onInitialize() {
		ConfigManager config = new ConfigManager("testmod", LOGGER);

		config.writeComment("test 1 comment (string)");
		String value = config.getString("test 1", "value 1");
		config.writeComment("test 2 comment (integer)");
		int value2 = config.getInt("test 2", 2);
		config.writeComment("test 3 comment (float)");
		float value3 = config.getFloat("test 3", 3.45F);
		config.writeComment("test 4 comment (double)");
		double value4 = config.getDouble("test 4", 4.66D);
		config.writeComment("test 5 comment (long)");
		long value5 = config.getLong("test 5", 5);
		config.writeComment("test 6 comment (string array)");
		String[] value6 = config.getStringArray("test 6", new String[]{"test1", "test2", "test3"});

		LOGGER.info(value);
		LOGGER.info(Integer.toString(value2));
		LOGGER.info(Float.toString(value3));
		LOGGER.info(Double.toString(value4));
		LOGGER.info(Long.toString(value5));
		LOGGER.info(String.join(",", value6));
	}
}
