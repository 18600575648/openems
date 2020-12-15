package io.openems.common;

public class KacoConstants {

	public final static String UPDATE_URL_DEV = "https://www.energydepot.de/primus-dev/update/";
	public final static String UPDATE_URL = "https://www.energydepot.de/hy-control/update/";
	public final static String LOCAL_FOLDER = "/usr/lib/hy-control/";
	public final static String EDGE_FILE = "hy-control.jar";
	public final static String EDGE_BACKUP = "hy-control_backup.jar";
	public final static String UI_FILE = "edge.zip";
	public final static String UI_FOLDER = "/var/www/html/";
	public final static String UI_FOLDER_BACKUP = LOCAL_FOLDER + "ui-backup/";
	//public final static String RESTART_CMD = "sudo systemctl restart hy-control.service";
	public final static String RESTART_CMD = "/etc/init.d/hy-control stop";
	//public final static String USERNAME = "pi";
	public final static String USERNAME = "root";
	public final static String PASSWORD = "";
	public final static String TMP_FOLDER = LOCAL_FOLDER + "download/";
}
