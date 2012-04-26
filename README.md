# bux

A money and currency manipulation library for Clojure

[![Build Status](https://secure.travis-ci.org/pelle/bux.png)](http://travis-ci.org/pelle/bux)

## Usage

Add the following to your project.clj

    [bux "0.0.4"]

### Currencies

    (use 'bux.currency)

Create a currency using create-currency:

    (create-currency {:symbol "$", :subunit "Centavo", :name "Argentine Peso", :iso-code "ARS", :iso-numeric "032", 
    :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first true, :priority 100})
    => #bux.currency.Currency{:iso-code "ARS", :name "Argentine Peso", :symbol "$", :subunit "Centavo", :subunit-to-unit 100, :symbol-first true, :html-entity "&#x20B1;", :iso-numeric "032", :priority 100}


Define currencies as vars in your current namespace:

    (defcurrency {:symbol "$", :subunit "Centavo", :name "Argentine Peso", :iso-code "ARS", :iso-numeric "032", 
    :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first true, :priority 100})
    => #'user/ARS

Load up predefined currencies:

    (use 'bux.currencies)

This adds all current national currencies to the bux.currencies namespace using the ISO code as the symbol.

    bux.currencies/USD
    => #bux.currency.Currency{:iso-code "USD", :name "United States Dollar", :symbol "$", :subunit "Cent", :subunit-to-unit 100, :symbol-first true, :html-entity "$", :iso-numeric "840", :priority 1}

Note currency list lifted from [Ruby Money](http://rubymoney.github.com/money/)

### Money

    (use 'bux.money)

Money objects can be created using a Currency record:

    (bux.currencies/USD 123)

If you're using Clojure 1.4 there is also experimental support for reader literals. The above would be:

    #bux/USD 123

This is currently implemented as a proxy to java.lang.Number. This may not be the right way of doing it. In fact it does not seem very clean.

Amount formatting should work for the majority of currencies.

    (str (#bux/USD 123))    
    => "$1.23"

Parse strings:

    (parse-amount bux.currencies/USD "$1,123.00")
    => #<Money $1,123>

### Calculations

Add money:

    (bux.calc/add #bux/USD 123 #bux/USD 234)
    #<Money $3.57>

    (bux.calc/add #bux/USD 123 2.34)
    #<Money $3.57>

Subtract:

    (bux.calc/subtract #bux/USD 123 #bux/USD 234)
    #<Money $-1.11>

    (bux.calc/subtract #bux/USD 123 2.34)
    #<Money $-1.11>


Multiply:

    (bux.calc/multiply #bux/USD 123 5)
    #<Money $6.15>

Division:

    (bux.calc/divide #bux/USD 123 2)
    #<Money $0.62>

Percentage:

    (bux.calc/percentage #bux/USD 123 10)
    #<Money $0.12>    

With Percentage (can be used for including sales tax, commissions etc.):

    (bux.calc/with-percentage #bux/USD 123 10)
    #<Money $1.35>

Percentage discount:

    (bux.calc/discount #bux/USD 123 10)
    #<Money $1.11>

## Big todos I need to fix now

Calculations don't work for more than 2 params at the moment.

## Future

A currency rate conversion lookup. Imagine using that with datomic and you would have perfect historical currency conversions.

## License

Copyright (C) 2012 Pelle Braendgaard http://stakeventures.com

Distributed under the Eclipse Public License, the same as Clojure.
