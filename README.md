# bux

A money and currency manipulation library for Clojure

_Note_ This is usable for simple amount formatting now. Calculations dont work correctly.

## Usage

Add the following to your project.clj

    [bux "0.0.1"]

### Currencies

    (use 'bux.currency)

Create a currency using create-currency:

    (create-currency {:symbol "$", :decimal_mark ",", :thousands_separator ".", :subunit "Centavo", :name "Argentine Peso", :iso_code "ARS", :iso_numeric "032", 
    :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :priority 100})
    => #bux.currency.Currency{:iso_code "ARS", :name "Argentine Peso", :symbol "$", :subunit "Centavo", :subunit_to_unit 100, :symbol_first true, :html_entity "&#x20B1;", :decimal_mark ",", :thousands_separator ".", :iso_numeric "032", :priority 100}


Define currencies as vars in your current namespace:

    (defcurrency {:symbol "$", :decimal_mark ",", :thousands_separator ".", :subunit "Centavo", :name "Argentine Peso", :iso_code "ARS", :iso_numeric "032", 
    :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :priority 100})
    => #'user/ARS

Load up predefined currencies:

    (use 'bux.currencies)

This adds all current national currencies to the bux.currencies namespace using the ISO code as the symbol.

    bux.currencies/USD
    => #bux.currency.Currency{:iso_code "USD", :name "United States Dollar", :symbol "$", :subunit "Cent", :subunit_to_unit 100, :symbol_first true, :html_entity "$", :decimal_mark ".", :thousands_separator ",", :iso_numeric "840", :priority 1}

Note currency list lifted from [Ruby Money](http://rubymoney.github.com/money/)

### Money

Money objects can be created using a Currency record:

    (bux.currencies/USD 123)

If you're using Clojure 1.4 there is also experimental support for reader literals. The above would be:

    #bux/USD 123

This is currently implemented as a proxy to java.lang.Number. This may not be the right way of doing it. In fact it does not seem very clean.

Amount formatting should work for the majority of currencies.

    (str (#bux/USD 123))    
    => "$1.23"

## Big todos I need to fix now

Calculations result in longs. Still trying to figure this out.

## Future

A currency rate conversion lookup. Imagine using that with datomic and you would have perfect historical currency conversions.

## License

Copyright (C) 2012 Pelle Braendgaard http://stakeventures.com

Distributed under the Eclipse Public License, the same as Clojure.