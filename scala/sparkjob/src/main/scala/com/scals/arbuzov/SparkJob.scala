package com.scals.arbuzov
// import required spark classes
import java.util

import com.pragmaticplay.bingo.core.logic.models.BingoPurchasedCardParts
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import com.pragmaticplay.bingo.core.logic.BingoLogicImpl
import com.pragmaticplay.bingo.core.logic.models._

object SparkJob {

    def execute() {

      // initialise spark context
      val conf = new SparkConf().setAppName("HelloWorld")
      val sc = new SparkContext(conf)
      println("############################")
      val bingoLogic = new BingoLogicImpl();
      println("############################000")

      val cards = new util.ArrayList[BingoPurchasedCard]()
      val patterns = new util.ArrayList[Pattern]()
      val roundWinningNumbers = "296430451626501260372239285905205663023211401870032321073872330804017414105827534109066669575435134852436549684773753444512467253142157117465536196261"


      val bingoPattern = new Pattern("1111111111111110000000000", "75", 1, 1)

      patterns.add(new Pattern(bingoPattern.getPatternNumbers, "S", 1, 1))


      var cardsIds = 50000
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "11090306023022262419413700433448574751536571676674"))

      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "02110513082728241921444200374147605553527265617364"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "07040812152427202216354000393746604850547172737570"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "11090306023022262419413700433448574751536571676674"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "11060502072219233024423600373354576059587362726964"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "05090111152319302125413900373254465857536272676370"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "06141310042325281924414400423455515246606973617275"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08061413071922182521403900433350496054487061636264"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "05010614102528192716394300324056545260497469617072"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "11031210011718213025353600424350535154597465616768"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "03150214102527182630364300383448604647516571686674"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "01070208042117222927404500433648475058537072677564"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "14130415081924272623453800364047505249536270737465"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "05020610091922182817373500313459475251486462677465"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "11010702062317181625394200353357595856526762706174"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "09050710062430192826413500393649545953476362666870"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "01080902143021182517354400343959524858577170687265"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "13020910071720222624423900333155585751527466706771"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "05111413122721161924444200454355574952517165616864"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "04130612102517292824433500344055495953517572636562"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "11120915013018272322443700423959515658537374696762"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "05101315072819161718343700324253475848557563646661"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "15030502122529301819374100314447504658576371747564"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "05011209062917242228384300424052566048506673696274"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08051201022228272526364200454058485556516861756563"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "14030809062324212627403700424351565355577064627265"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "04050906121924181726443200423553585446476267617573"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "07141105082921172823444100333959605556537066717573"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "02080104062420281629404100444556474654556970716675"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "02091308142225202629314100393248575059557562676465"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "07040812152716251924444000373252464756507073746772"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "01130914052628242527354200313447545358597466756373"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08140715022623222920433800394049525960546872706669"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "03050414151630222325404400353158555750547162636770"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "13081012051623222726383100404152545649536371707472"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "02080309102629162523364200404352515648596770616265"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "15040112031820292722403100394353585546606772716568"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "06030915082319221724403300374454604849516164747167"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "06010811123029191722383900414351595654606765707464"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "02110704091920282230454000413247585355516575696172"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "10080304132627292528344200454359574746606472756174"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08051506131724211618333900314255474648536473686362"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12080905061728202921394500373146525047596566676871"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "10021113042124292016453700393252586053557161746465"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08011015122329201617323100393354534649486263696465"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08121105133025241817353100333254574649477168676366"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "11030412063027282924433500323853595657476866747269"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12100815022919222417384000413547484954567573656364"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08021305101626182717433200384556594753576569736867"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08031105062017162924324300404449485651576167717268"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "02090304081830242620423300393855464854476766617074"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "04030501061716271830393100443259485152546865616274"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "07150203062325292627364000394555545949466668646271"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "02100906082820232721363700343855544860536965637566"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "10011208023028172422383300454348516058507573666970"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "03130701062018302619444200433152595455606965647571"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "05110708031930242018344300383756475754487367716962"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "04071501052523302421354300403154515855487466696573"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "04011305122425212219454100433860534855517468676371"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "13120614052325263029413800403248535550607368666971"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12100215052122241930423600354056464952476964706371"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "15020110112029162717423200383160494854567464676275"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12080409062017222316413700433158605551596671657574"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12060702111920212316393100364455595860486270656974"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "13030910012320182417404300323449595356486174656872"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "10010804032029172523314300453347525448516672706961"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "03140609072824232721413500444246495759566873716463"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "03020107091817262829433200374453505247547065646372"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "03080510153020262327444000323559555453507269737574"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "14090507112725192318374100343551525954577169637068"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "04110815062521221629384100453249485952586670717469"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "11131009152220231719414400454250475760536166747369"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "01100315022927251724353600443458475248506475737068"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "15051011072330162227403200453858565551477264657169"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "05130406012719211728373800433457475051536866716975"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "15131101081820162628414200363747535159567370616762"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "01030614072318211730343600314446494753566873757465"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12141507042417292526383200414347575150596366677164"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "15071409042520182724363500424549534860477564627173"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12130602072128302523404200334446485159536369746870"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "02090510082428182623323700413860585048536775696361"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "07040609112629232216333500324454595160467475617266"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "07020409122623241920424500334157544855516863677374"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "05081113102729232619363800324055464850586873616662"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "06050713121918292827403400453948495347547367616871"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12011304082922231721324500394355525451596569676163"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "09040107022324223027433500364456535855496774626971"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "10041112082421262317404300333846525957507468736567"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12070304152620271729454200414454575351496875646173"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "03070414082825202919353900323154554751597270666963"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "01081305092025172919333800444554495156506663726762"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "10110912081716202628333700383154485647596968676274"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12131505012830241727394300343351525047607265696663"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08091201132722182330454300384249545847606563667164"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "01150412052517212923324200413457535251487168737472"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "11141505122818242330403700384258474854467463736964"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08090615102130262225454200414348505951466873706661"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "03091307021718242820423400323560474849577470716467"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "08100613122018192726384100394249485458607173667472"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "07090211062028301625373300434448524955567370666762"))
      cards.add(new BingoPurchasedCard({cardsIds += 1; cardsIds - 1}, "12021413052116271920374400344355544849607167757466"))



      println("############################0001")
      val filledCards: util.List[BingoPurchasedCardParts] = bingoLogic.fillWinningNumbersInCards(cards, patterns, roundWinningNumbers)

      // do stuff
      println("############################")
      println("############################")
      println("########HELLO WORLD#########")
      println("############################")
      println("############################")

      // terminate spark context
      sc.stop()

    }
}
