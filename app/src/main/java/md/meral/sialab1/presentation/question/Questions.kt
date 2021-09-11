package md.meral.sialab1.presentation.question

import md.meral.sialab1.presentation.util.BinaryNode

class Questions {
    fun createBinaryTree(): BinaryNode<String> {

        val root = BinaryNode("Salut, doresti sa cumperi un calculator nou?")

        val rootDa = BinaryNode("Da")
        root.addChild(rootDa)

        val tipDeFolosire = BinaryNode("Pentru ce doriti sa folositi?")
        rootDa.addChild(tipDeFolosire)

        val educatieSauLucru = BinaryNode("Educatie/Lucru")
        tipDeFolosire.addChild(educatieSauLucru)

        val eSLOcupatie = BinaryNode("Cu ce va ocupati?")
        educatieSauLucru.addChild(eSLOcupatie)

        val student = BinaryNode("Student/a")
        eSLOcupatie.addChild(student)

        val sTipDeAplicatii = BinaryNode("Ce tip de aplicatii folositi?")
        student.addChild(sTipDeAplicatii)

        val sAIngineria = BinaryNode("Aplicatii de Ingineria/Design")
        sTipDeAplicatii.addChild(sAIngineria)

        val sAInginariaResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "GPU: Nvidia GTX1650\n" +
                    "CPU: Intel Core I5 / Ryzen 5\n" +
                    "RAM: 16GB"
        )
        sAIngineria.addChild(sAInginariaResult)

        val sAOffice = BinaryNode("Aplicatii de Office")
        sTipDeAplicatii.addChild(sAOffice)

        val sAOJoc = BinaryNode("Jucati jocuri de calculator?")
        sAOffice.addChild(sAOJoc)

        val sAODa = BinaryNode("Da")
        sAOJoc.addChild(sAODa)

        val sAODaResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "GPU: Nvidia GTX1650\n" +
                    "CPU: Intel Core I5 / Ryzen 5 \n" +
                    "RAM: 8GB"
        )
        sAODa.addChild(sAODaResult)

        val sAONu = BinaryNode("Nu")
        sAOJoc.addChild(sAONu)

        val sAONuResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "GPU: Intel HD Graphics\n" +
                    "CPU: Intel Core I5/ Ryzen 5\n" +
                    "RAM: 8GB"
        )
        sAONu.addChild(sAONuResult)

        val inginer = BinaryNode("Inginarie/Design")
        eSLOcupatie.addChild(inginer)

        val iTipSO = BinaryNode("Alegeti un sistem de operatie.")
        inginer.addChild(iTipSO)

        val iTipSOMacOS = BinaryNode("MacOS")
        iTipSO.addChild(iTipSOMacOS)

        val iTipSOMacOSOcupatie = BinaryNode("Cu ce va ocupati?")
        iTipSOMacOS.addChild(iTipSOMacOSOcupatie)

        val iTipSOMDesigner = BinaryNode("Designer")
        iTipSOMacOSOcupatie.addChild(iTipSOMDesigner)

        val iTipSOMDResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "Macbook Pro 16\n" +
                    "1TB 16GB"
        )
        iTipSOMDesigner.addChild(iTipSOMDResult)

        val iTipSOMProgramist = BinaryNode("Programist")
        iTipSOMacOSOcupatie.addChild(iTipSOMProgramist)

        val iTipSOMPResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "Macbook Pro 13 512GB 16GB"
        )
        iTipSOMProgramist.addChild(iTipSOMPResult)

        val iTipSOWindows = BinaryNode("Windows")
        iTipSO.addChild(iTipSOWindows)

        val iTipSOWResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "GPU: Nvidia GTX1650\n" +
                    "CPU: Intel Core I5 / Ryzen 5\n" +
                    "RAM: 16GB"
        )
        iTipSOWindows.addChild(iTipSOWResult)

        val angajat = BinaryNode("Angajati de birou")
        eSLOcupatie.addChild(angajat)

        val aJoc = BinaryNode("Jucati jocuri de calculator?")
        angajat.addChild(aJoc)

        val aJocDa = BinaryNode("Da")
        aJoc.addChild(aJocDa)

        val aJocDaResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "GPU: Nvidia GTX1650\n" +
                    "CPU: Intel Core I5 / Ryzen 5\n" +
                    "RAM: 8GB"
        )
        aJocDa.addChild(aJocDaResult)

        val aJocNu = BinaryNode("Nu")
        aJoc.addChild(aJocNu)

        val aJocSO = BinaryNode("Ce tip de sisteme de operatie doriti sa folositi?")
        aJocNu.addChild(aJocSO)

        val aJocSOW = BinaryNode("Windows")
        aJocSO.addChild(aJocSOW)

        val aJocSOWResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "GPU: Intel HD Graphics\n" +
                    "CPU: Intel Core I5/ Ryzen 5\n" +
                    "RAM: 8GB"
        )
        aJocSOW.addChild(aJocSOWResult)

        val aJocSOM = BinaryNode("MacOS")
        aJocSO.addChild(aJocSOM)

        val aJocSOMResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "Macbook Air 13"
        )
        aJocSOM.addChild(aJocSOMResult)

        val gaming = BinaryNode("Gaming")
        tipDeFolosire.addChild(gaming)

        val tipBuget = BinaryNode("Alegeti bugetul vostru.")
        gaming.addChild(tipBuget)

        val bugetMic = BinaryNode("Buget mic")
        tipBuget.addChild(bugetMic)

        val avetiCalculator = BinaryNode("Aveti calculator cu internet rapid?")
        bugetMic.addChild(avetiCalculator)

        val calculatorDa = BinaryNode("Da")
        avetiCalculator.addChild(calculatorDa)

        val calculatorDaResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "Gerforce NOW"
        )
        calculatorDa.addChild(calculatorDaResult)

        val calculatorNu = BinaryNode("Nu")
        avetiCalculator.addChild(calculatorNu)

        val calculatorNuResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "GPU: Nvidia GTX1650\n" +
                    "CPU: Intel Core I5 / Ryzen 5\n" +
                    "RAM: 8GB"
        )
        calculatorNu.addChild(calculatorNuResult)

        val bugetMare = BinaryNode("Buget mare")
        tipBuget.addChild(bugetMare)

        val bugetMareResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "GPU: Nvidia RTX2080\n" +
                    "CPU: Intel Core I5 / Ryzen 5\n" +
                    "RAM: 16GB"
        )
        bugetMare.addChild(bugetMareResult)

        val consolaGamer = BinaryNode("Sunt consola gamer")
        tipBuget.addChild(consolaGamer)

        val tipConsol = BinaryNode("Ce tip de consol doriti?")
        consolaGamer.addChild(tipConsol)

        val tipPortabil = BinaryNode("Portabil")
        tipConsol.addChild(tipPortabil)

        val nintendo = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "Nintendo Switch"
        )
        tipPortabil.addChild(nintendo)

        val tipMasa = BinaryNode("De masa")
        tipConsol.addChild(tipMasa)

        val console = BinaryNode("Alegeti o consola")
        tipMasa.addChild(console)

        val playstation = BinaryNode("Playstation")
        console.addChild(playstation)

        val playstationResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "Playstation 5"
        )
        playstation.addChild(playstationResult)

        val xbox = BinaryNode("Xbox")
        console.addChild(xbox)

        val xboxResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "Xbox Series S si abonament Game Pass"
        )
        xbox.addChild(xboxResult)

        val casa = BinaryNode("Casa")
        tipDeFolosire.addChild(casa)

        val cSO = BinaryNode("Alegeti un sistem de operatie")
        casa.addChild(cSO)

        val cWindows = BinaryNode("Windows")
        cSO.addChild(cWindows)

        val cWindowsResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "GPU: Intel HD Graphics\n" +
                    "CPU: Intel Core I3 / Ryzen 3\n" +
                    "Ram: 8GB"
        )
        cWindows.addChild(cWindowsResult)

        val cMacOS = BinaryNode("MacOS")
        cSO.addChild(cMacOS)

        val cMacOSResult = BinaryNode(
            "Cerinte Minime de Sistem\n" +
                    "Macbook Air 13"
        )
        cMacOS.addChild(cMacOSResult)

        val rootNu = BinaryNode("Nu")
        root.addChild(rootNu)

        return root
    }
}