package emiyaj.util

/**
 * Validate values from the request.
 */
class Validation {
    companion object {
        private val villagerCodes = listOf("dog18", "dog17", "dog16", "dog10", "dog09", "dog07", "dog05", "dog08", "dog14", "dog01", "dog00", "dog02", "dog03", "dog04", "dog06", "dog15", "flg11", "flg18", "flg19", "flg15", "flg17", "flg09", "flg05", "flg00", "flg16", "flg06", "flg13", "flg01", "flg02", "flg04", "flg10", "flg03", "flg07", "flg12", "ant09", "ant06", "ant08", "ant00", "ant02", "ant03", "ant01", "gor10", "gor05", "gor04", "gor09", "gor08", "gor00", "gor01", "gor07", "gor02", "cat21", "cat02", "cat20", "cat15", "cat01", "cat04", "cat07", "cat11", "cat14", "cat16", "cat17", "cat10", "cat13", "cat09", "cat03", "cat05", "cat12", "cat18", "cat23", "cat19", "cat00", "cat06", "cat08", "wol08", "wol12", "wol10", "wol09", "wol04", "wol01", "wol02", "wol06", "wol03", "wol05", "wol00", "squ13", "squ17", "squ02", "squ14", "squ18", "squ16", "squ10", "squ15", "squ01", "squ03", "squ09", "squ00", "squ04", "squ05", "squ08", "squ06", "squ07", "squ11", "chn13", "chn12", "chn10", "chn11", "chn00", "chn09", "chn05", "chn01", "chn02", "pbr08", "pbr03", "pbr09", "pbr06", "pbr02", "pbr07", "pbr00", "pbr05", "pbr01", "pig14", "pig16", "pig09", "pig10", "pig17", "pig15", "pig08", "pig13", "pig01", "pig11", "pig00", "pig02", "pig04", "pig03", "pig05", "hrs07", "hrs13", "hrs11", "hrs12", "hrs16", "hrs08", "hrs09", "hrs05", "hrs01", "hrs00", "hrs04", "hrs02", "hrs06", "hrs03", "hrs10", "ocp02", "ocp01", "ocp00", "der05", "der08", "der02", "der06", "der07", "der09", "der03", "der00", "der04", "der01", "lon04", "lon08", "lon07", "lon02", "lon01", "lon00", "lon06", "brd15", "brd16", "brd11", "brd06", "brd05", "brd17", "brd18", "brd08", "brd01", "brd03", "brd00", "brd04", "brd02", "mus16", "mus17", "mus18", "mus08", "mus01", "mus09", "mus00", "mus15", "mus03", "mus10", "mus04", "mus05", "mus14", "mus02", "mus12", "bul08", "bul07", "bul03", "bul05", "bul01", "bul00", "cbr07", "cbr19", "cbr09", "cbr13", "cbr17", "cbr16", "cbr01", "cbr00", "cbr10", "cbr02", "cbr04", "cbr14", "cbr03", "cbr05", "cbr15", "cbr06", "crd08", "crd07", "crd02", "crd06", "crd01", "crd04", "crd00", "cow07", "cow06", "cow01", "cow00", "shp10", "shp04", "shp13", "shp11", "shp12", "shp03", "shp15", "shp01", "shp07", "shp09", "shp00", "shp02", "shp08", "goa08", "goa09", "goa02", "goa07", "goa06", "goa00", "goa04", "goa01", "duk17", "duk11", "duk16", "duk13", "duk00", "duk04", "duk03", "duk06", "duk12", "duk15", "duk02", "duk07", "duk10", "duk05", "duk01", "duk08", "duk09", "mnk07", "mnk06", "mnk08", "mnk04", "mnk01", "mnk05", "mnk03", "mnk02", "kgr08", "kgr09", "kgr02", "kgr10", "kgr00", "kgr01", "kgr06", "kgr05", "elp12", "elp05", "elp09", "elp07", "elp10", "elp04", "elp00", "elp03", "elp06", "elp01", "elp02", "rhn08", "rhn04", "rhn02", "rhn07", "rhn00", "rhn01", "kal10", "kal04", "kal08", "kal09", "kal01", "kal02", "kal00", "kal03", "kal05", "bea13", "bea14", "bea08", "bea02", "bea11", "bea15", "bea09", "bea01", "bea07", "bea10", "bea12", "bea03", "bea00", "bea06", "bea05", "ost05", "ost10", "ost07", "ost03", "ost06", "ost08", "ost02", "ost09", "ost01", "ost00", "rbt19", "rbt11", "rbt14", "rbt18", "rbt17", "rbt10", "rbt04", "rbt02", "rbt07", "rbt12", "rbt00", "rbt01", "rbt05", "rbt06", "rbt13", "rbt16", "rbt03", "rbt08", "rbt15", "rbt09", "pgn12", "pgn13", "pgn09", "pgn14", "pgn00", "pgn04", "pgn05", "pgn06", "pgn10", "pgn01", "pgn11", "pgn03", "pgn02", "hip09", "hip05", "hip00", "hip08", "hip03", "hip02", "hip04", "ham02", "ham04", "ham03", "ham05", "ham07", "ham06", "ham01", "ham00", "tig05", "tig06", "tig02", "tig03", "tig00", "tig01", "tig04", "ant05", "mnk09", "der11", "rbt21", "crd05", "ost04", "pbr10", "mus19", "ham09", "squ21", "dog11", "kal07", "pgn07", "ocp04", "rhn05", "brd09", "rbt20", "gor11", "cbr18", "shp14", "der10", "elp11")

        /**
         * Check villager's code is valid.
         *
         * @param code Code of villager
         * @return Return true if code is available, return false if code is invalid.
         */
        fun villagerCode(code: String): Boolean = villagerCodes.contains(code)

        /**
         * Check request timestamp in the payload.
         *
         * @param value decrypted payload. example: 1599787809052<>{"data": "123"}
         * @return payload without timestamp. If invalid timestamp or passed 5 minutes, return null. example using param example: {"data": "123"}
         */
        fun encryptedTime(value: String): String? {
            try {
                val arr = value.split("<>")
                val time = arr[0].toLongOrNull() ?: return null
                return if (time + 5 < System.currentTimeMillis() / 1000) {
                    null
                } else {
                    arr[1]
                }
            } catch (e: Exception) {
                return null
            }
        }
    }
}