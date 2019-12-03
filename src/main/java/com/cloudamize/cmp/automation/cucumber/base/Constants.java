package com.cloudamize.cmp.automation.cucumber.base;


public class Constants extends TestBase 
{
	// xpaths, ids of all the pages
	// Login Page
	
		public static final String username = "j_username";
		public static final String password = "j_password";
		public static final String LoginButton = "loginSubmit";
		public static final String computeNodes = "//*[@id=\"nodeCountLabel\"]";
		
		public static final String usernameLink = "//div[@id='userNameAction']";
		public static final String logoutLink = "//div[@id='userlogout']";
		public static final String azureDetailsButton = "//button[@id='showAzureDetailButton']";
		public static final String gridtitle = "//*[@id='gridTitleId']";
		public static final String Gridloader = "//div[@class='grid-loader']";

    // Overview Page
		
		public static final String summarytab = "//*[@id='summaryTabId']";
		public static final String computetab = "//*[@id='computeTabId']";
		public static final String MigrationPlannerButton = "//*[@id='MigrationPlannerButtonId']";
		public static final String MoreToolsButton = "//div[@id='moreToolsButtonId']";
		public static final String MoreToolsButton500Nodes = "//div[@id='moreToolsButtonId']";
		public static final String loadingIcon = "//div[@class='gwt-PopupPanel']//div[@id='loading']";
		
		public static final String PopUpPanleGlass="//*[@class='gwt-PopupPanelGlass']";
		public static final String PopUpPanel="//*[@class='gwt-PopupPanel']";
		public static final String settings = "//div[@id='userSettings']";
		public static final String assetsettingstab = "//div[@class='hTab']";
		public static final String StorageTab = "//div[@id='storageTabId']";
		public static final String NetwrokTab = "//div[@id='networkTabId']";
		public static final String ShowAzureViewDetails = "showAzureDetailButton";
		
		
  //Migration Planner
		public static final String MigrationPlannerOption = "//div[@id='userSettings'][contains(text(),'Migration Planner')]";
		public static final String DashboardLink = "//div[@class='gwt-Label user-panel'][contains(text(),'Dashboard')]";
		public static final String productiontab = "//div[@class='name-label asset-label-box'][contains(@title, 'Production')]";
		public static final String advancedFiltering = "//*[@id='dynamicFilterButtonId']";
		public static final String lowUtilization = "//div[@class='filter-left-item-system'][contains(@title, 'Low-Utilization')]";
		public static final String closeIconPanel = "//div[@class='closeIconPanel']/img";
		public static final String MigrateYourEnvironment = "//div[@id='migrationIntegrationButtonId']";
		public static final String BuildMachineBasedMoveGroups = "//div[@id='filterButtonId']";
		public static final String BuildApplicationBasedMoveGroups = "//div[@id='buildAppGroupButtonId']";
		public static final String clearAllCheckBox = "//input[@id='gwt-uid-29499']";
		public static final String productionCheckBox = "//input[@id='gwt-uid-29503']";
		public static final String ApplicationInventorySettings = "//div[@id='inventorySettingsId']";
		public static final String SummaryTab = "//div[@id='SummaryId']";
		public static final String MigrationDeatilsOpenLink = "//div[@class='GMXIMBOBK1']";
		public static final String SummaryTabOpenLinks = "//div[@class='GMXIMBOBD2 GMXIMBOBA2'][contains(text(),'Open')]";
		public static final String DetailedLinks = "//div[@class='GMXIMBOBD2 GMXIMBOBA2'][contains(text(),'Detailed')]";
		public static final String undoMigrationPlannerChanges = "//div[@id='undoGroupingButtonId']";
		public static final String CSVBuilder = "//div[@id='exportCsvButtonId']";
		public static final String CSVExporter = "//div[@id='downloadCsvButtonId']";
		public static final String SQLServerAndLicenseUsage = "//div[@id='dmaAndLicenseButton']";
		public static final String ApplicationView = "//div[@class='gwt-TabLayoutPanelTab GMXIMBOBCB']";
		public static final String MachineDetailsDetailed = "//div[@id='machineDetailedBlock']/div[@class='GMXIMBOBO1 GMXIMBOBL1']";
		public static final String FirewallRulesDetailedLink = "//div[@id='firewallRulesBlock']/div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Detailed')]";
		public static final String InstalledAppsDetailedLink = "//div[@id='installedAppsBlock']/div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Detailed')]";
		public static final String ClientAppDNS = "//div[@id='appDNSBlock']/div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Detailed')]";
		public static final String AppCPUUsage = "//div[@id='appCPUBlock']/div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Detailed')]";
		public static final String IPAndDNS = "//div[@id='ipAndDnsBlock']/div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Detailed')]";
		public static final String APPInterconnectivityAll = "//div[@id='appInterconnectivity']/div[@class='GMXIMBOBD2 GMXIMBOBA2'][contains(text(),'Detailed')]";
		public static final String APPInterconnectivitySelectedOnly = "//div[@id='appInterconnectivitySelectedOnly']/div[@class='GMXIMBOBD2 GMXIMBOBA2'][contains(text(),'Detailed')]";
		public static final String InterNodeCommunication = "//div[@id='interCommunication']/div[@class='GMXIMBOBD2 GMXIMBOBA2'][contains(text(),'Detailed')]";
		public static final String DownloadAll = "//div[@class='GMXIMBOBA2 GMXIMBOBD2'][contains(text(),'Download All')]";
		public static final String Isodr = "//div[@class='name-label asset-label-box'][contains(@title, 'ISODR')]";
		public static final String NJHealthPAS = "//div[@class='name-label asset-label-box'][contains(@title, 'NJ Health PAS')]";
		public static final String others50000 = "//div[@class='name-label asset-label-box'][contains(@title, 'other')]";
		public static final String Dashboardoption = "//div[@id='userSettings'][contains(text(),'Dashboard')]";					
		public static final String MigrationPlannerLink = "//div[@class='gwt-Label user-panel'][contains(text(),'Migration Planner')]";		
		public static final String ProjectManagementTab = "//div[@id='ProjectManagementId']";	
		public static final String FirewallOpenLink = "//div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Open')]";
		public static final String InstalledAppsOpenLink = "//div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Open')]";
		public static final String ClientAppDNSOpenLink = "//div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Open')]";
		public static final String AppCPUUsageOpenLink = "//div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Open')]";
		public static final String IPandDNSOpenLink = "//div[@class='GMXIMBOBO1 GMXIMBOBL1'][contains(text(),'Open')]";

}