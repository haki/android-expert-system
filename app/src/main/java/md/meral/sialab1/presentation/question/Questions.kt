package md.meral.sialab1.presentation.question

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import md.meral.sialab1.presentation.util.BinaryNode
import md.meral.sialab1.R

class Questions {

    @Composable
    fun createBinaryTree(): BinaryNode<String> {

        val root = BinaryNode(stringResource(id = R.string.hi_do_you_want_to_buy))

        val rootYes = BinaryNode(stringResource(id = R.string.yes))
        root.addChild(rootYes)

        val whatDoYouWant = BinaryNode(stringResource(id = R.string.what_do_you_want))
        rootYes.addChild(whatDoYouWant)

        val educationWork = BinaryNode(stringResource(id = R.string.education_work))
        whatDoYouWant.addChild(educationWork)

        val eLProfession = BinaryNode(stringResource(id = R.string.what_profession_do_you_have))
        educationWork.addChild(eLProfession)

        val student = BinaryNode(stringResource(id = R.string.student))
        eLProfession.addChild(student)

        val sAppYouUse = BinaryNode(stringResource(id = R.string.what_kind_of_apps_do_you_use))
        student.addChild(sAppYouUse)

        val sEngineeringDesign = BinaryNode(stringResource(id = R.string.engineering_design))
        sAppYouUse.addChild(sEngineeringDesign)

        val sEngineeringDesignResult = BinaryNode(stringResource(id = R.string.gtx_8gb))
        sEngineeringDesign.addChild(sEngineeringDesignResult)

        val sAOffice = BinaryNode(stringResource(id = R.string.office))
        sAppYouUse.addChild(sAOffice)

        val sAGame = BinaryNode(stringResource(id = R.string.do_you_play_computer_games))
        sAOffice.addChild(sAGame)

        val sAYes = BinaryNode(stringResource(id = R.string.yes))
        sAGame.addChild(sAYes)

        val sAODaResult = BinaryNode(stringResource(id = R.string.gtx_8gb))
        sAYes.addChild(sAODaResult)

        val sANo = BinaryNode(stringResource(id = R.string.no))
        sAGame.addChild(sANo)

        val sANoResult = BinaryNode(stringResource(id = R.string.intel_8gb))
        sANo.addChild(sANoResult)

        val engineerDesigner = BinaryNode(stringResource(id = R.string.engineer_designer))
        eLProfession.addChild(engineerDesigner)

        val eOperatingSystem = BinaryNode(stringResource(id = R.string.choose_an_operating_system))
        engineerDesigner.addChild(eOperatingSystem)

        val eOperationSystemMacOS = BinaryNode(stringResource(id = R.string.mac_os))
        eOperatingSystem.addChild(eOperationSystemMacOS)

        val eMacOSProfession = BinaryNode(stringResource(id = R.string.what_profession_do_you_have))
        eOperationSystemMacOS.addChild(eMacOSProfession)

        val eMacOSDesigner = BinaryNode(stringResource(id = R.string.designer))
        eMacOSProfession.addChild(eMacOSDesigner)

        val eMacOSDesignerResult = BinaryNode(stringResource(id = R.string.macbook_pro_16))
        eMacOSDesigner.addChild(eMacOSDesignerResult)

        val eMacOSProgrammer = BinaryNode(stringResource(id = R.string.programmer))
        eMacOSProfession.addChild(eMacOSProgrammer)

        val eMacOSProgrammerResult = BinaryNode(stringResource(id = R.string.macbook_pro_13))
        eMacOSProgrammer.addChild(eMacOSProgrammerResult)

        val eWindows = BinaryNode(stringResource(id = R.string.windows))
        eOperatingSystem.addChild(eWindows)

        val eWindowsResult = BinaryNode(stringResource(id = R.string.gtx_16gb))
        eWindows.addChild(eWindowsResult)

        val officeWorker = BinaryNode(stringResource(id = R.string.office_worker))
        eLProfession.addChild(officeWorker)

        val officeGamer = BinaryNode(stringResource(id = R.string.do_you_play_computer_games))
        officeWorker.addChild(officeGamer)

        val officeGamerYes = BinaryNode(stringResource(id = R.string.yes))
        officeGamer.addChild(officeGamerYes)

        val officeGamerYesResult = BinaryNode(stringResource(id = R.string.gtx_8gb))
        officeGamerYes.addChild(officeGamerYesResult)

        val officeGamerNo = BinaryNode(stringResource(id = R.string.no))
        officeGamer.addChild(officeGamerNo)

        val officeGamerOS = BinaryNode(stringResource(id = R.string.choose_an_operating_system))
        officeGamerNo.addChild(officeGamerOS)

        val officeGamerOSWindows = BinaryNode(stringResource(id = R.string.windows))
        officeGamerOS.addChild(officeGamerOSWindows)

        val officeGamerOSWindowsResult = BinaryNode(stringResource(id = R.string.intel_8gb) )
        officeGamerOSWindows.addChild(officeGamerOSWindowsResult)

        val officeMacOS = BinaryNode(stringResource(id = R.string.mac_os))
        officeGamerOS.addChild(officeMacOS)

        val officeMacOSResult = BinaryNode(stringResource(id = R.string.macbook_air_13))
        officeMacOS.addChild(officeMacOSResult)

        val gaming = BinaryNode(stringResource(id = R.string.gaming))
        whatDoYouWant.addChild(gaming)

        val budgetType = BinaryNode(stringResource(id = R.string.what_is_your_budget))
        gaming.addChild(budgetType)

        val smallBudget = BinaryNode(stringResource(id = R.string.small))
        budgetType.addChild(smallBudget)

        val fastInternet = BinaryNode(stringResource(id = R.string.fast_internet))
        smallBudget.addChild(fastInternet)

        val internetYes = BinaryNode(stringResource(id = R.string.yes))
        fastInternet.addChild(internetYes)

        val internetYesResult = BinaryNode(stringResource(id = R.string.geforce_now))
        internetYes.addChild(internetYesResult)

        val internetNo = BinaryNode(stringResource(id = R.string.no))
        fastInternet.addChild(internetNo)

        val internetNoResult = BinaryNode(stringResource(id = R.string.gtx_8gb))
        internetNo.addChild(internetNoResult)

        val bigBudget = BinaryNode(stringResource(id = R.string.big))
        budgetType.addChild(bigBudget)

        val bigBudgetResult = BinaryNode(stringResource(id = R.string.rtx))
        bigBudget.addChild(bigBudgetResult)

        val consoleGamer = BinaryNode(stringResource(id = R.string.console_gamer))
        budgetType.addChild(consoleGamer)

        val consoleType = BinaryNode(stringResource(id = R.string.choose_a_console))
        consoleGamer.addChild(consoleType)

        val portable = BinaryNode(stringResource(id = R.string.portable))
        consoleType.addChild(portable)

        val nintendo = BinaryNode(stringResource(id = R.string.nintendo))
        portable.addChild(nintendo)

        val unMovable = BinaryNode(stringResource(id = R.string.unmovable))
        consoleType.addChild(unMovable)

        val console = BinaryNode(stringResource(id = R.string.choose_a_console))
        unMovable.addChild(console)

        val playstation = BinaryNode(stringResource(id = R.string.playstation))
        console.addChild(playstation)

        val playstationResult = BinaryNode(stringResource(id = R.string.playstation_5))
        playstation.addChild(playstationResult)

        val xbox = BinaryNode(stringResource(id = R.string.xbox))
        console.addChild(xbox)

        val xboxResult = BinaryNode(stringResource(id = R.string.xbox_S))
        xbox.addChild(xboxResult)

        val home = BinaryNode(stringResource(id = R.string.home))
        whatDoYouWant.addChild(home)

        val homeOS = BinaryNode(stringResource(id = R.string.choose_an_operating_system))
        home.addChild(homeOS)

        val hWindows = BinaryNode(stringResource(id = R.string.windows))
        homeOS.addChild(hWindows)

        val hWindowsResult = BinaryNode(stringResource(id = R.string.intel_8gb))
        hWindows.addChild(hWindowsResult)

        val hMacOS = BinaryNode(stringResource(id = R.string.mac_os))
        homeOS.addChild(hMacOS)

        val hMacOSResult = BinaryNode(stringResource(id = R.string.macbook_air_13))
        hMacOS.addChild(hMacOSResult)

        val rootNo = BinaryNode(stringResource(id = R.string.no))
        root.addChild(rootNo)

        return root
    }
}