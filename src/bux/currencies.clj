(ns bux.currencies
  (:use [bux.currency]))

(def all-currencies
  [{:symbol "р.", :subunit "Kopek", :name "Russian Ruble", :iso-code "RUB", :iso-numeric "643", :subunit-to-unit 100, :html-entity "&#x0440;&#x0443;&#x0431;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Sen", :name "Brunei Dollar", :iso-code "BND", :iso-numeric "096", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "New Zealand Dollar", :iso-code "NZD", :iso-numeric "554", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Congolese Franc", :iso-code "CDF", :iso-numeric "976", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "zł", :subunit "Grosz", :name "Polish Złoty", :iso-code "PLN", :iso-numeric "985", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "T", :subunit "Sene", :name "Samoan Tala", :iso-code "WST", :iso-numeric "882", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Burundian Franc", :iso-code "BIF", :iso-numeric "108", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "৳", :subunit "Paisa", :name "Bangladeshi Taka", :iso-code "BDT", :iso-numeric "050", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ZK", :subunit "Ngwee", :name "Zambian Kwacha", :iso-code "ZMK", :iso-numeric "894", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "₫", :subunit "Hào", :name "Vietnamese Đồng", :iso-code "VND", :iso-numeric "704", :subunit-to-unit 10, :html-entity "&#x20AB;", :symbol-first true, :decimal-points 1 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Rwandan Franc", :iso-code "RWF", :iso-numeric "646", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "R", :subunit "Cent", :name "South African Rand", :iso-code "ZAR", :iso-numeric "710", :subunit-to-unit 100, :html-entity "&#x0052;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "New Taiwan Dollar", :iso-code "TWD", :iso-numeric "901", :subunit-to-unit 100, :html-entity "$", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Hong Kong Dollar", :iso-code "HKD", :iso-numeric "344", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "₭", :subunit "Att", :name "Lao Kip", :iso-code "LAK", :iso-numeric "418", :subunit-to-unit 100, :html-entity "&#x20AD;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Bs F", :subunit "Céntimo", :name "Venezuelan Bolívar", :iso-code "VEF", :iso-numeric "937", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Sh", :subunit "Cent", :name "Tanzanian Shilling", :iso-code "TZS", :iso-numeric "834", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "د.إ", :subunit "Fils", :name "United Arab Emirates Dirham", :iso-code "AED", :iso-numeric "784", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Sh", :subunit "Cent", :name "Somali Shilling", :iso-code "SOS", :iso-numeric "706", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Vt", :subunit nil, :name "Vanuatu Vatu", :iso-code "VUV", :iso-numeric "548", :subunit-to-unit 1, :html-entity "", :symbol-first true, :decimal-points 0 :priority 100} 
  {:symbol nil, :subunit "Tyiyn", :name "Kyrgyzstani Som", :iso-code "KGS", :iso-numeric "417", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "د.ت", :subunit "Millime", :name "Tunisian Dinar", :iso-code "TND", :iso-numeric "788", :subunit-to-unit 1000, :html-entity "", :symbol-first false, :decimal-points 3 :priority 100} 
  {:symbol "C$", :subunit "Centavo", :name "Nicaraguan Córdoba", :iso-code "NIO", :iso-numeric "558", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "din. or дин.", :subunit "Para", :name "Serbian Dinar", :iso-code "RSD", :iso-numeric "941", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "m", :subunit "Tennesi", :name "Turkmenistani Manat", :iso-code "TMM", :iso-numeric "795", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "€", :subunit "Cent", :name "Euro", :iso-code "EUR", :iso-numeric "978", :subunit-to-unit 100, :html-entity "&#x20AC;", :symbol-first false, :decimal-points 2 :priority 2} 
  {:symbol "B/.", :subunit "Centésimo", :name "Panamanian Balboa", :iso-code "PAB", :iso-numeric "590", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Br", :subunit "Kapyeyka", :name "Belarusian Ruble", :iso-code "BYR", :iso-numeric "974", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "₴", :subunit "Kopiyka", :name "Ukrainian Hryvnia", :iso-code "UAH", :iso-numeric "980", :subunit-to-unit 100, :html-entity "&#x20B4", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Canadian Dollar", :iso-code "CAD", :iso-numeric "124", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 5} 
  {:symbol "RM", :subunit "Sen", :name "Malaysian Ringgit", :iso-code "MYR", :iso-numeric "458", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Namibian Dollar", :iso-code "NAD", :iso-numeric "516", :subunit-to-unit 100, :html-entity "$", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol nil, :subunit "Chertrum", :name "Bhutanese Ngultrum", :iso-code "BTN", :iso-numeric "064", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Singapore Dollar", :iso-code "SGD", :iso-numeric "702", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Zimbabwean Dollar", :iso-code "ZWD", :iso-numeric "716", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "kr", :subunit "Øre", :name "Danish Krone", :iso-code "DKK", :iso-numeric "208", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Sk", :subunit "Halier", :name "Slovak Koruna", :iso-code "SKK", :iso-numeric "703", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ب.د", :subunit "Fils", :name "Bahraini Dinar", :iso-code "BHD", :iso-numeric "048", :subunit-to-unit 1000, :html-entity "", :symbol-first true, :decimal-points 3 :priority 100} 
  {:symbol nil, :subunit "Santim", :name "Ethiopian Birr", :iso-code "ETB", :iso-numeric "230", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Ft", :subunit "Fillér", :name "Hungarian Forint", :iso-code "HUF", :iso-numeric "348", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Comorian Franc", :iso-code "KMF", :iso-numeric "174", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Bermudian Dollar", :iso-code "BMD", :iso-numeric "060", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "د.ك", :subunit "Fils", :name "Kuwaiti Dinar", :iso-code "KWD", :iso-numeric "414", :subunit-to-unit 1000, :html-entity "", :symbol-first true, :decimal-points 3 :priority 100} 
  {:symbol "L", :subunit "Sente", :name "Lesotho Loti", :iso-code "LSL", :iso-numeric "426", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Dominican Peso", :iso-code "DOP", :iso-numeric "214", :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "₱", :subunit "Centavo", :name "Philippine Peso", :iso-code "PHP", :iso-numeric "608", :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Guinean Franc", :iso-code "GNF", :iso-numeric "324", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "£", :subunit "Piastre", :name "Sudanese Pound", :iso-code "SDG", :iso-numeric "938", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Belize Dollar", :iso-code "BZD", :iso-numeric "084", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Cayman Islands Dollar", :iso-code "KYD", :iso-numeric "136", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "MTn", :subunit "Centavo", :name "Mozambican Metical", :iso-code "MZN", :iso-numeric "943", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Nfk", :subunit "Cent", :name "Eritrean Nakfa", :iso-code "ERN", :iso-numeric "232", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "₡", :subunit "Centavo", :name "Salvadoran Colón", :iso-code "SVC", :iso-numeric "222", :subunit-to-unit 100, :html-entity "&#x20A1;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Rp", :subunit "Sen", :name "Indonesian Rupiah", :iso-code "IDR", :iso-numeric "360", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "£ or ج.م", :subunit "Piastre", :name "Egyptian Pound", :iso-code "EGP", :iso-numeric "818", :subunit-to-unit 100, :html-entity "&#x00A3;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "KM or КМ", :subunit "Fening", :name "Bosnia and Herzegovina Convertible Mark", :iso-code "BAM", :iso-numeric "977", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "د.ج", :subunit "Centime", :name "Algerian Dinar", :iso-code "DZD", :iso-numeric "012", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "P", :subunit "Avo", :name "Macanese Pataca", :iso-code "MOP", :iso-numeric "446", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Argentine Peso", :iso-code "ARS", :iso-numeric "032", :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ر.ق", :subunit "Dirham", :name "Qatari Riyal", :iso-code "QAR", :iso-numeric "634", :subunit-to-unit 100, :html-entity "&#xFDFC;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Bs.", :subunit "Centavo", :name "Bolivian Boliviano", :iso-code "BOB", :iso-numeric "068", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "៛", :subunit "Sen", :name "Cambodian Riel", :iso-code "KHR", :iso-numeric "116", :subunit-to-unit 100, :html-entity "&#x17DB;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "L", :subunit "Ban", :name "Moldovan Leu", :iso-code "MDL", :iso-numeric "498", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "ع.د", :subunit "Fils", :name "Iraqi Dinar", :iso-code "IQD", :iso-numeric "368", :subunit-to-unit 1000, :html-entity "", :symbol-first false, :decimal-points 3 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Cuban Convertible Peso", :iso-code "CUC", :iso-numeric "931", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "﷼", :subunit "Fils", :name "Yemeni Rial", :iso-code "YER", :iso-numeric "886", :subunit-to-unit 100, :html-entity "&#xFDFC;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "G", :subunit "Centime", :name "Haitian Gourde", :iso-code "HTG", :iso-numeric "332", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Australian Dollar", :iso-code "AUD", :iso-numeric "036", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 4} 
  {:symbol "ƒ", :subunit "Cent", :name "Netherlands Antillean Gulden", :iso-code "ANG", :iso-numeric "532", :subunit-to-unit 100, :html-entity "&#x0192;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "₪", :subunit "Agora", :name "Israeli New Sheqel", :iso-code "ILS", :iso-numeric "376", :subunit-to-unit 100, :html-entity "&#x20AA;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ЅМ", :subunit "Diram", :name "Tajikistani Somoni", :iso-code "TJS", :iso-numeric "972", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "ر.س", :subunit "Hallallah", :name "Saudi Riyal", :iso-code "SAR", :iso-numeric "682", :subunit-to-unit 100, :html-entity "&#xFDFC;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Trinidad and Tobago Dollar", :iso-code "TTD", :iso-numeric "780", :subunit-to-unit 100, :html-entity "$", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "kr", :subunit "Öre", :name "Swedish Krona", :iso-code "SEK", :iso-numeric "752", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Cuban Peso", :iso-code "CUP", :iso-numeric "192", :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Bahamian Dollar", :iso-code "BSD", :iso-numeric "044", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Lt", :subunit "Centas", :name "Lithuanian Litas", :iso-code "LTL", :iso-numeric "440", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Le", :subunit "Cent", :name "Sierra Leonean Leone", :iso-code "SLL", :iso-numeric "694", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "East Caribbean Dollar", :iso-code "XCD", :iso-numeric "951", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "D", :subunit "Butut", :name "Gambian Dalasi", :iso-code "GMD", :iso-numeric "270", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Sh", :subunit "Cent", :name "Kenyan Shilling", :iso-code "KES", :iso-numeric "404", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Guyanese Dollar", :iso-code "GYD", :iso-numeric "328", :subunit-to-unit 100, :html-entity "$", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Surinamese Dollar", :iso-code "SRD", :iso-numeric "968", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "〒", :subunit "Tiyn", :name "Kazakhstani Tenge", :iso-code "KZT", :iso-numeric "398", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "د.ا", :subunit "Piastre", :name "Jordanian Dinar", :iso-code "JOD", :iso-numeric "400", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "L", :subunit "Cent", :name "Swazi Lilangeni", :iso-code "SZL", :iso-numeric "748", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "₵", :subunit "Pesewa", :name "Ghanaian Cedi", :iso-code "GHS", :iso-numeric "936", :subunit-to-unit 100, :html-entity "&#x20B5;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "₩", :subunit "Chŏn", :name "North Korean Won", :iso-code "KPW", :iso-numeric "408", :subunit-to-unit 100, :html-entity "&#x20A9;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Jamaican Dollar", :iso-code "JMD", :iso-numeric "388", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "MK", :subunit "Tambala", :name "Malawian Kwacha", :iso-code "MWK", :iso-numeric "454", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "kr", :subunit "Eyrir", :name "Icelandic Króna", :iso-code "ISK", :iso-numeric "352", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "₨", :subunit "Paisa", :name "Indian Rupee", :iso-code "INR", :iso-numeric "356", :subunit-to-unit 100, :html-entity "&#x20A8;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "UM", :subunit "Khoums", :name "Mauritanian Ouguiya", :iso-code "MRO", :iso-numeric "478", :subunit-to-unit 5, :html-entity "", :symbol-first false, :decimal-points 1 :priority 100} 
  {:symbol "₨", :subunit "Paisa", :name "Pakistani Rupee", :iso-code "PKR", :iso-numeric "586", :subunit-to-unit 100, :html-entity "&#x20A8;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "K", :subunit "Toea", :name "Papua New Guinean Kina", :iso-code "PGK", :iso-numeric "598", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "﷼", :subunit "Dinar", :name "Iranian Rial", :iso-code "IRR", :iso-numeric "364", :subunit-to-unit 100, :html-entity "&#xFDFC;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "؋", :subunit "Pul", :name "Afghan Afghani", :iso-code "AFN", :iso-numeric "971", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "₡", :subunit "Céntimo", :name "Costa Rican Colón", :iso-code "CRC", :iso-numeric "188", :subunit-to-unit 100, :html-entity "&#x20A1;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ر.ع.", :subunit "Baisa", :name "Omani Rial", :iso-code "OMR", :iso-numeric "512", :subunit-to-unit 1000, :html-entity "&#xFDFC;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol nil, :subunit "Tiyin", :name "Uzbekistani Som", :iso-code "UZS", :iso-numeric "860", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "¥", :subunit "Fen", :name "Chinese Renminbi Yuan", :iso-code "CNY", :iso-numeric "156", :subunit-to-unit 100, :html-entity "&#x5713;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "฿", :subunit "Satang", :name "Thai Baht", :iso-code "THB", :iso-numeric "764", :subunit-to-unit 100, :html-entity "&#x0E3F;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Cfp Franc", :iso-code "XPF", :iso-numeric "953", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Kč", :subunit "Haléř", :name "Czech Koruna", :iso-code "CZK", :iso-numeric "203", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ރ.", :subunit "Laari", :name "Maldivian Rufiyaa", :iso-code "MVR", :iso-numeric "462", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol nil, :subunit "Qəpik", :name "Azerbaijani Manat", :iso-code "AZN", :iso-numeric "944", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "₦", :subunit "Kobo", :name "Nigerian Naira", :iso-code "NGN", :iso-numeric "566", :subunit-to-unit 100, :html-entity "&#x20A6;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "T$", :subunit "Seniti", :name "Tongan Paʻanga", :iso-code "TOP", :iso-numeric "776", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "R$ ", :subunit "Centavo", :name "Brazilian Real", :iso-code "BRL", :iso-numeric "986", :subunit-to-unit 100, :html-entity "R$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ден", :subunit "Deni", :name "Macedonian Denar", :iso-code "MKD", :iso-numeric "807", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "P", :subunit "Thebe", :name "Botswana Pula", :iso-code "BWP", :iso-numeric "072", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "£", :subunit "Penny", :name "Saint Helenian Pound", :iso-code "SHP", :iso-numeric "654", :subunit-to-unit 100, :html-entity "&#x00A3;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "United States Dollar", :iso-code "USD", :iso-numeric "840", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 1} 
  {:symbol "TL", :subunit "kuruş", :name "Turkish Lira", :iso-code "TRY", :iso-numeric "949", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "L", :subunit "Ban", :name "Romanian Leu", :iso-code "RON", :iso-numeric "946", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Centésimo", :name "Uruguayan Peso", :iso-code "UYU", :iso-numeric "858", :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "د.م.", :subunit "Centime", :name "Moroccan Dirham", :iso-code "MAD", :iso-numeric "504", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol nil, :subunit "Iraimbilanja", :name "Malagasy Ariary", :iso-code "MGA", :iso-numeric "969", :subunit-to-unit 5, :html-entity "", :symbol-first false, :decimal-points 1 :priority 100} 
  {:symbol "ل.ل", :subunit "Piastre", :name "Lebanese Pound", :iso-code "LBP", :iso-numeric "422", :subunit-to-unit 100, :html-entity "&#x00A3;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Central African Cfa Franc", :iso-code "XAF", :iso-numeric "950", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Colombian Peso", :iso-code "COP", :iso-numeric "170", :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Liberian Dollar", :iso-code "LRD", :iso-numeric "430", :subunit-to-unit 100, :html-entity "$", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "₨", :subunit "Cent", :name "Sri Lankan Rupee", :iso-code "LKR", :iso-numeric "144", :subunit-to-unit 100, :html-entity "&#x0BF9;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "դր.", :subunit "Luma", :name "Armenian Dram", :iso-code "AMD", :iso-numeric "051", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$ or Esc", :subunit "Centavo", :name "Cape Verdean Escudo", :iso-code "CVE", :iso-numeric "132", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Fr", :subunit "Rappen", :name "Swiss Franc", :iso-code "CHF", :iso-numeric "756", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "kn", :subunit "Lipa", :name "Croatian Kuna", :iso-code "HRK", :iso-numeric "191", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "£", :subunit "Penny", :name "Falkland Pound", :iso-code "FKP", :iso-numeric "238", :subunit-to-unit 100, :html-entity "&#x00A3;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "K", :subunit "Pya", :name "Myanmar Kyat", :iso-code "MMK", :iso-numeric "104", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "L", :subunit "Qintar", :name "Albanian Lek", :iso-code "ALL", :iso-numeric "008", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "kr", :subunit "Øre", :name "Norwegian Krone", :iso-code "NOK", :iso-numeric "578", :subunit-to-unit 100, :html-entity "kr", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ل.د", :subunit "Dirham", :name "Libyan Dinar", :iso-code "LYD", :iso-numeric "434", :subunit-to-unit 1000, :html-entity "", :symbol-first false, :decimal-points 3 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Fijian Dollar", :iso-code "FJD", :iso-numeric "242", :subunit-to-unit 100, :html-entity "$", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "£ or ل.س", :subunit "Piastre", :name "Syrian Pound", :iso-code "SYP", :iso-numeric "760", :subunit-to-unit 100, :html-entity "&#x00A3;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "₨", :subunit "Cent", :name "Mauritian Rupee", :iso-code "MUR", :iso-numeric "480", :subunit-to-unit 100, :html-entity "&#x20A8;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Djiboutian Franc", :iso-code "DJF", :iso-numeric "262", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "£", :subunit "Penny", :name "Gibraltar Pound", :iso-code "GIP", :iso-numeric "292", :subunit-to-unit 100, :html-entity "&#x00A3;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "лв", :subunit "Stotinka", :name "Bulgarian Lev", :iso-code "BGN", :iso-numeric "975", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "Db", :subunit "Cêntimo", :name "São Tomé and Príncipe Dobra", :iso-code "STD", :iso-numeric "678", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Mexican Peso", :iso-code "MXN", :iso-numeric "484", :subunit-to-unit 100, :html-entity "$", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ლ", :subunit "Tetri", :name "Georgian Lari", :iso-code "GEL", :iso-numeric "981", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Ls", :subunit "Santīms", :name "Latvian Lats", :iso-code "LVL", :iso-numeric "428", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "£", :subunit "Penny", :name "British Pound", :iso-code "GBP", :iso-numeric "826", :subunit-to-unit 100, :html-entity "&#x00A3;", :symbol-first true, :decimal-points 2 :priority 3} 
  {:symbol "₨", :subunit "Cent", :name "Seychellois Rupee", :iso-code "SCR", :iso-numeric "690", :subunit-to-unit 100, :html-entity "&#x20A8;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "West African Cfa Franc", :iso-code "XOF", :iso-numeric "952", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Solomon Islands Dollar", :iso-code "SBD", :iso-numeric "090", :subunit-to-unit 100, :html-entity "$", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Sh", :subunit "Cent", :name "Ugandan Shilling", :iso-code "UGX", :iso-numeric "800", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "L", :subunit "Centavo", :name "Honduran Lempira", :iso-code "HNL", :iso-numeric "340", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "ƒ", :subunit "Cent", :name "Aruban Florin", :iso-code "AWG", :iso-numeric "533", :subunit-to-unit 100, :html-entity "&#x0192;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "₨", :subunit "Paisa", :name "Nepalese Rupee", :iso-code "NPR", :iso-numeric "524", :subunit-to-unit 100, :html-entity "&#x20A8;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Peso", :name "Chilean Peso", :iso-code "CLP", :iso-numeric "152", :subunit-to-unit 1, :html-entity "&#x20B1;", :symbol-first true, :decimal-points 0 :priority 100} 
  {:symbol "₩", :subunit "Jeon", :name "South Korean Won", :iso-code "KRW", :iso-numeric "410", :subunit-to-unit 100, :html-entity "&#x20A9;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "¥", :subunit nil, :name "Japanese Yen", :iso-code "JPY", :iso-numeric "392", :subunit-to-unit 1, :html-entity "&#x00A5;", :symbol-first true, :decimal-points 0 :priority 6} 
  {:symbol "₮", :subunit "Möngö", :name "Mongolian Tögrög", :iso-code "MNT", :iso-numeric "496", :subunit-to-unit 100, :html-entity "&#x20AE;", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Kz", :subunit "Cêntimo", :name "Angolan Kwanza", :iso-code "AOA", :iso-numeric "973", :subunit-to-unit 100, :html-entity "", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "S/.", :subunit "Céntimo", :name "Peruvian Nuevo Sol", :iso-code "PEN", :iso-numeric "604", :subunit-to-unit 100, :html-entity "S/.", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "₲", :subunit "Céntimo", :name "Paraguayan Guaraní", :iso-code "PYG", :iso-numeric "600", :subunit-to-unit 100, :html-entity "&#x20B2;", :symbol-first true, :decimal-points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Barbadian Dollar", :iso-code "BBD", :iso-numeric "052", :subunit-to-unit 100, :html-entity "$", :symbol-first false, :decimal-points 2 :priority 100} 
  {:symbol "Q", :subunit "Centavo", :name "Guatemalan Quetzal", :iso-code "GTQ", :iso-numeric "320", :subunit-to-unit 100, :html-entity "", :symbol-first true, :decimal-points 2 :priority 100}
  {:symbol "฿", :subunit "Satoshi", :name "Bitcoin", :iso-code "BTC", :subunit-to-unit 100000000, :symbol-first true, :decimal-points 4 :priority 1}])

(doseq [c all-currencies]
  (defcurrency c))

(def ^:dynamic default-currency (eval (symbol (.getCurrencyCode (.getCurrency (java.text.NumberFormat/getCurrencyInstance))))))
