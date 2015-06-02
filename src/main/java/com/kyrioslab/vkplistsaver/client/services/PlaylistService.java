package com.kyrioslab.vkplistsaver.client.services;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.kyrioslab.vkplistsaver.client.dto.Track;
import com.kyrioslab.vkplistsaver.client.dto.TrackItemRetriever;


/**
 * Created by Ivan Kirilyuk on 01.06.15.
 * <p/>
 * Playlist management VK service.
 */
public class PlaylistService implements VKService {

    /**
     * Get all user playlist tracks.
     *
     * @return playlist track items.
     */
    @Override
    public JsArray<Track> getTracks() {

        //TODO: get response string
        String jsonString = testJson;
        TrackItemRetriever res = JsonUtils.safeEval(jsonString);
        return res.retrieve();
    }

    private String testJson = "{" +
            "  \"response\": {" +
            "    \"count\": 3214," +
            "    \"items\": [" +
            "      {" +
            "        \"id\": \"34\"," +
            "        \"photo\": \"https:\\/\\/pp.vk.me\\/c617119\\/v617119034\\/ce27\\/jlKfbdpqdnI.jpg\"," +
            "        \"name\": \"Татьяна Плуталова\"," +
            "        \"name_gen\": \"Татьяны\"" +
            "      }," +
            "      {" +
            "        \"id\": 369352437," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Jamie xx\"," +
            "        \"title\": \"The Rest Is Noise\"," +
            "        \"duration\": 298," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c422819\\/u247967449\\/audios\\/2fe30105def5.mp3?extra=vkO0-uzqARXagHHBp3SiNxWa64u7j-9N6vF_YHY1xsb5I0w8vzf9U6X6aWOy1CLI-bUuYTmCDA2LRYQx8wbSycRx\"," +
            "        \"album_id\": 54669064," +
            "        \"genre_id\": 9," +
            "        \"no_search\": 1" +
            "      }," +
            "      {" +
            "        \"id\": 367103745," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Wildcat! Wildcat!\"," +
            "        \"title\": \"Up & Beyond\"," +
            "        \"duration\": 223," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c536323\\/u34665207\\/audios\\/3824fe9f2949.mp3?extra=J9ITSkXQCmE9crwSEvSnXXhg5YKCfNnAIQ6tfT99gzdz7tnxciJPhylpZDHAEET9kJcTibg0RJvytl8Gi4-Xb0-o\"," +
            "        \"lyrics_id\": 189000669," +
            "        \"genre_id\": 9" +
            "      }," +
            "      {" +
            "        \"id\": 367103668," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Sego \"," +
            "        \"title\": \"Wicket Youth\"," +
            "        \"duration\": 197," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c422930\\/u66320988\\/audios\\/3875b88fc362.mp3?extra=tbJBQFSgg37-LANg80vQGYOHHY4DJ2cIMMOMSqaeSoeBJI5Z-YxPbegkm9t2pr7d18PN0sFdrx4JmTSrn-zj9Xqx\"," +
            "        \"lyrics_id\": 211180746," +
            "        \"genre_id\": 9" +
            "      }," +
            "      {" +
            "        \"id\": 370348749," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Hot Chip\"," +
            "        \"title\": \"Need You Now\"," +
            "        \"duration\": 285," +
            "        \"url\": \"https:\\/\\/cs9-15v4.vk.me\\/p9\\/68331ffc8ea421.mp3?extra=8SMOeR4GVPtqK0oijode6ioMyS1jvXulJj_FqYYutTAZIOjGlXKPiloZ4cIoir6DoJPQZHsV770X61UkC6F8SEX2\"," +
            "        \"lyrics_id\": 243041470," +
            "        \"genre_id\": 22" +
            "      }," +
            "      {" +
            "        \"id\": 370357889," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Clubfeet\"," +
            "        \"title\": \"Say Something\"," +
            "        \"duration\": 242," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c4777\\/u27836690\\/audios\\/8f2c32317178.mp3?extra=KeecnKtuCX0uF9-WZXtm-gEEwJG6ZrmpBX-V8XatkCopWrE0cnOhPvbDCG7FdLvcVQnYOF83GmH_-Aert89fDtYo\"," +
            "        \"genre_id\": 18" +
            "      }," +
            "      {" +
            "        \"id\": 367105942," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Kasabian\"," +
            "        \"title\": \"Days Are Forgotten\"," +
            "        \"duration\": 302," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c5606\\/u4137203\\/audios\\/c1119823f10e.mp3?extra=TtmbAnmaUBHZUE0sIDYxjjBMNY2_Y_jlmj7MgZADGH-Im0V0No768YKdogkWhh0jkLBxa1AM9WCZfI3wcvQQHhl0\"," +
            "        \"lyrics_id\": 19745082," +
            "        \"genre_id\": 18" +
            "      }," +
            "      {" +
            "        \"id\": 351645866," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Talisco\"," +
            "        \"title\": \"My Home\"," +
            "        \"duration\": 221," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c521523\\/u189964137\\/audios\\/c768c335378c.mp3?extra=PSKwzM8wRkNQy2-Cy1QL2xWWsdaO_9AZWvcMmhXarOrQL33Ap_fyVcGkkqzklvqVSi3PmHKt-aZkXx3EfKib1H3Q\"" +
            "      }," +
            "      {" +
            "        \"id\": 343529374," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Hozier\"," +
            "        \"title\": \"Work Song\"," +
            "        \"duration\": 228," +
            "        \"url\": \"https:\\/\\/cs9-15v4.vk.me\\/p22\\/2be79bb6ec8d7b.mp3?extra=cRUqFUiIsPav72NC_D__EgKaKW3Srk0feHkkI21Yqwp98b96svvNs3LKbqOiH4E4FcPy5__5Xv3iyoZZbR4yx586\"," +
            "        \"lyrics_id\": 158844806," +
            "        \"genre_id\": 21" +
            "      }," +
            "      {" +
            "        \"id\": 343498252," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Jessie Ware\"," +
            "        \"title\": \"You & I (Forever)\"," +
            "        \"duration\": 239," +
            "        \"url\": \"https:\\/\\/cs9-12v4.vk.me\\/p14\\/f274b25bfcba82.mp3?extra=JdasgQCyAH5llOum5cKqekyD23Tb2ABEpgn8tVsDEjxuEDGErk384fnCOtQpaXmDY9hNnzZDvTvj5TlPQYzbc2tG\"," +
            "        \"genre_id\": 2," +
            "        \"no_search\": 1" +
            "      }," +
            "      {" +
            "        \"id\": 341581713," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Junip\"," +
            "        \"title\": \"Your Life, Your Call\"," +
            "        \"duration\": 247," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c6111\\/u187354524\\/audios\\/ff56fbec89ee.mp3?extra=YXOI2BlK5bZVx10KMNGAt0nCWo1hpLcctszwC8-RCs60HolWO3lUnSp9CwCKMJVZsyHPQU9mDqYshuUmMtBGkc_N\"," +
            "        \"lyrics_id\": 75818033" +
            "      }," +
            "      {" +
            "        \"id\": 338219487," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Croquet Club\"," +
            "        \"title\": \"Only You Can Tell (Original Mix)\"," +
            "        \"duration\": 268," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c536619\\/u20734949\\/audios\\/3cd12a725568.mp3?extra=J3nUo3FXgxl_i6ZQ9d8oR6HsnIFpZkk5He6nQoeEN6WTaS525nPqBmoF9IYX4hB_BhhUo-YgDmUJpQ__ystIBRe8\"," +
            "        \"lyrics_id\": 198431478," +
            "        \"album_id\": 54669064," +
            "        \"genre_id\": 5" +
            "      }," +
            "      {" +
            "        \"id\": 344199511," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Sia\"," +
            "        \"title\": \"Elastic Heart\"," +
            "        \"duration\": 257," +
            "        \"url\": \"https:\\/\\/cs9-12v4.vk.me\\/p22\\/b20ac03301a3f3.mp3?extra=7uXqIrjfYbsV57bT3xtFYxZA4Jyk45rdiRNy7H9GQPEVH0ynCO68hm-rKN0G5AYYgTMcN75r6u4zcFVuG4Zc-rO_\"," +
            "        \"lyrics_id\": 186180265," +
            "        \"genre_id\": 17" +
            "      }," +
            "      {" +
            "        \"id\": 337507262," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Jessie Ware\"," +
            "        \"title\": \"Keep On Lying\"," +
            "        \"duration\": 211," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c422418\\/u1642121\\/audios\\/2605a4e53e7a.mp3?extra=nV4xVLHKACi6oI5_Mvr6Ntj0eKnTxm2AbL0t1otCbua5goViYweXlAWGY2HU-2eLUHH-D6-6pEMwgdTP36XMrLd-\"," +
            "        \"lyrics_id\": 203628876," +
            "        \"album_id\": 7103361," +
            "        \"genre_id\": 2" +
            "      }," +
            "      {" +
            "        \"id\": 321364793," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Aaron Embry\"," +
            "        \"title\": \"The Raven's Song\"," +
            "        \"duration\": 145," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c536620\\/u51443606\\/audios\\/bd3f71232634.mp3?extra=QvOJdJR1uo_YrKUoGbBgAf4trdSqDAXjhMgle54ZEHuHZexfgP54pbulbg9GtoCFt14mhQPZxhmTppbfQU-0-s1G\"," +
            "        \"genre_id\": 9" +
            "      }," +
            "      {" +
            "        \"id\": 354956558," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Thirty seconds to Mars\"," +
            "        \"title\": \" Kings & Queens\"," +
            "        \"duration\": 298," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c4375\\/u16455869\\/audios\\/3f0d1491bcc3.mp3?extra=OW--PqkJhh7dUM6RW9oKzpPlqkKs5YHI6uQaOjj9eVmgRhAzUqZahRq521yKsQSID4TJFfcP3hssX0bi5n1M2lZ8\"," +
            "        \"lyrics_id\": 3077675," +
            "        \"genre_id\": 18" +
            "      }," +
            "      {" +
            "        \"id\": 318936948," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"The Smiths\"," +
            "        \"title\": \"How Soon Is Now\"," +
            "        \"duration\": 233," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c536617\\/u259609611\\/audios\\/73c3872bac15.mp3?extra=nSCzHbORm-l-DkYFbUrb0ROf-ORhxqcjdZYEgR2pVoOZyVjWHsMR5T_L2BvTpzK1421ap6-F2TByfpEDgHoKRk0c\"," +
            "        \"genre_id\": 9" +
            "      }," +
            "      {" +
            "        \"id\": 312975563," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Thom Yorke\"," +
            "        \"title\": \"Guess Again!\"," +
            "        \"duration\": 263," +
            "        \"url\": \"https:\\/\\/psv4.vk.me\\/c536308\\/u95237423\\/audios\\/a4ffe4e1d225.mp3?extra=rGycLnV6eqCa_RI2JF1qpqngoBanJJbN3HM9gxWDPMd0nJ_n8dLPck_Zcc9EE1mso27TPHSGsnamsIffuVYbItj_\"," +
            "        \"genre_id\": 22" +
            "      }," +
            "      {" +
            "        \"id\": 326999593," +
            "        \"owner_id\": 34," +
            "        \"artist\": \"Sigma\"," +
            "        \"title\": \"Changing (feat. Paloma Faith)\"," +
            "        \"duration\": 192," +
            "        \"url\": \"https:\\/\\/cs9-10v4.vk.me\\/p1\\/6b41306561b987.mp3?extra=Mr9-uLB45PEsE0U3CdOE2VrDYgtwz6Ko0p-Ae3yd37_ezKZS8-Js5Ep2F5AjlRFbNg9W87HzJbgYfUejLUF52i8M\"," +
            "        \"lyrics_id\": 185246670," +
            "        \"album_id\": 54669064," +
            "        \"genre_id\": 9" +
            "      }" +
            "    ]" +
            "  }" +
            "}";
}
