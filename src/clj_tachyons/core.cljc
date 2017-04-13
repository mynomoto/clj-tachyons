(ns clj-tachyons.core
  (:require
    [clojure.spec :as s]))

(s/def ::valid-classes
  #{:absolute
    :absolute--fill
    :absolute--fill-l
    :absolute--fill-m
    :absolute--fill-ns
    :absolute-l
    :absolute-m
    :absolute-ns
    :aspect-ratio
    :aspect-ratio--16x9
    :aspect-ratio--16x9-l
    :aspect-ratio--16x9-m
    :aspect-ratio--16x9-ns
    :aspect-ratio--1x1
    :aspect-ratio--1x1-l
    :aspect-ratio--1x1-m
    :aspect-ratio--1x1-ns
    :aspect-ratio--3x4
    :aspect-ratio--3x4-l
    :aspect-ratio--3x4-m
    :aspect-ratio--3x4-ns
    :aspect-ratio--4x3
    :aspect-ratio--4x3-l
    :aspect-ratio--4x3-m
    :aspect-ratio--4x3-ns
    :aspect-ratio--4x6
    :aspect-ratio--4x6-l
    :aspect-ratio--4x6-m
    :aspect-ratio--4x6-ns
    :aspect-ratio--5x7
    :aspect-ratio--5x7-l
    :aspect-ratio--5x7-m
    :aspect-ratio--5x7-ns
    :aspect-ratio--5x8
    :aspect-ratio--5x8-l
    :aspect-ratio--5x8-m
    :aspect-ratio--5x8-ns
    :aspect-ratio--6x4
    :aspect-ratio--6x4-l
    :aspect-ratio--6x4-m
    :aspect-ratio--6x4-ns
    :aspect-ratio--7x5
    :aspect-ratio--7x5-l
    :aspect-ratio--7x5-m
    :aspect-ratio--7x5-ns
    :aspect-ratio--8x5
    :aspect-ratio--8x5-l
    :aspect-ratio--8x5-m
    :aspect-ratio--8x5-ns
    :aspect-ratio--9x16
    :aspect-ratio--9x16-l
    :aspect-ratio--9x16-m
    :aspect-ratio--9x16-ns
    :aspect-ratio--object
    :aspect-ratio--object-l
    :aspect-ratio--object-m
    :aspect-ratio--object-ns
    :aspect-ratio-l
    :aspect-ratio-m
    :aspect-ratio-ns
    :athelas
    :avenir
    :b
    :b--black
    :b--black-0125
    :b--black-025
    :b--black-05
    :b--black-10
    :b--black-20
    :b--black-30
    :b--black-40
    :b--black-50
    :b--black-60
    :b--black-70
    :b--black-80
    :b--black-90
    :b--blue
    :b--dark-blue
    :b--dark-gray
    :b--dark-green
    :b--dark-pink
    :b--dark-red
    :b--dashed
    :b--dashed-l
    :b--dashed-m
    :b--dashed-ns
    :b--dotted
    :b--dotted-l
    :b--dotted-m
    :b--dotted-ns
    :b--gold
    :b--gray
    :b--green
    :b--hot-pink
    :b--inherit
    :b--light-blue
    :b--light-gray
    :b--light-green
    :b--light-pink
    :b--light-purple
    :b--light-red
    :b--light-silver
    :b--light-yellow
    :b--lightest-blue
    :b--mid-gray
    :b--moon-gray
    :b--navy
    :b--near-black
    :b--near-white
    :b--none
    :b--none-l
    :b--none-m
    :b--none-ns
    :b--orange
    :b--pink
    :b--purple
    :b--red
    :b--silver
    :b--solid
    :b--solid-l
    :b--solid-m
    :b--solid-ns
    :b--transparent
    :b--washed-blue
    :b--washed-green
    :b--washed-red
    :b--washed-yellow
    :b--white
    :b--white-0125
    :b--white-025
    :b--white-05
    :b--white-10
    :b--white-20
    :b--white-30
    :b--white-40
    :b--white-50
    :b--white-60
    :b--white-70
    :b--white-80
    :b--white-90
    :b--yellow
    :b-l
    :b-m
    :b-ns
    :ba
    :ba-l
    :ba-m
    :ba-ns
    :baskerville
    :bb
    :bb-0
    :bb-0-l
    :bb-0-m
    :bb-0-ns
    :bb-l
    :bb-m
    :bb-ns
    :bg-animate
    :bg-animate:focus
    :bg-animate:hover
    :bg-black
    :bg-black-05
    :bg-black-10
    :bg-black-20
    :bg-black-30
    :bg-black-40
    :bg-black-50
    :bg-black-60
    :bg-black-70
    :bg-black-80
    :bg-black-90
    :bg-blue
    :bg-bottom
    :bg-bottom-l
    :bg-bottom-m
    :bg-bottom-ns
    :bg-center
    :bg-center-l
    :bg-center-m
    :bg-center-ns
    :bg-dark-blue
    :bg-dark-gray
    :bg-dark-green
    :bg-dark-pink
    :bg-dark-red
    :bg-gold
    :bg-gray
    :bg-green
    :bg-hot-pink
    :bg-inherit
    :bg-left
    :bg-left-l
    :bg-left-m
    :bg-left-ns
    :bg-light-blue
    :bg-light-gray
    :bg-light-green
    :bg-light-pink
    :bg-light-purple
    :bg-light-red
    :bg-light-silver
    :bg-light-yellow
    :bg-lightest-blue
    :bg-mid-gray
    :bg-moon-gray
    :bg-navy
    :bg-near-black
    :bg-near-white
    :bg-orange
    :bg-pink
    :bg-purple
    :bg-red
    :bg-right
    :bg-right-l
    :bg-right-m
    :bg-right-ns
    :bg-silver
    :bg-top
    :bg-top-l
    :bg-top-m
    :bg-top-ns
    :bg-transparent
    :bg-washed-blue
    :bg-washed-green
    :bg-washed-red
    :bg-washed-yellow
    :bg-white
    :bg-white-10
    :bg-white-20
    :bg-white-30
    :bg-white-40
    :bg-white-50
    :bg-white-60
    :bg-white-70
    :bg-white-80
    :bg-white-90
    :bg-yellow
    :bl
    :bl-0
    :bl-0-l
    :bl-0-m
    :bl-0-ns
    :bl-l
    :bl-m
    :bl-ns
    :black
    :black-05
    :black-10
    :black-20
    :black-30
    :black-40
    :black-50
    :black-60
    :black-70
    :black-80
    :black-90
    :blue
    :bn
    :bn-l
    :bn-m
    :bn-ns
    :bodoni
    :border-box
    :bottom--1
    :bottom--1-l
    :bottom--1-m
    :bottom--1-ns
    :bottom--2
    :bottom--2-l
    :bottom--2-m
    :bottom--2-ns
    :bottom-0
    :bottom-0-l
    :bottom-0-m
    :bottom-0-ns
    :bottom-1
    :bottom-1-l
    :bottom-1-m
    :bottom-1-ns
    :bottom-2
    :bottom-2-l
    :bottom-2-m
    :bottom-2-ns
    :br
    :br--bottom
    :br--bottom-l
    :br--bottom-m
    :br--bottom-ns
    :br--left
    :br--left-l
    :br--left-m
    :br--left-ns
    :br--right
    :br--right-l
    :br--right-m
    :br--right-ns
    :br--top
    :br--top-l
    :br--top-m
    :br--top-ns
    :br-0
    :br-0-l
    :br-0-m
    :br-0-ns
    :br-100
    :br-100-l
    :br-100-m
    :br-100-ns
    :br-l
    :br-m
    :br-ns
    :br-pill
    :br-pill-l
    :br-pill-m
    :br-pill-ns
    :br0
    :br0-l
    :br0-m
    :br0-ns
    :br1
    :br1-l
    :br1-m
    :br1-ns
    :br2
    :br2-l
    :br2-m
    :br2-ns
    :br3
    :br3-l
    :br3-m
    :br3-ns
    :br4
    :br4-l
    :br4-m
    :br4-ns
    :bt
    :bt-0
    :bt-0-l
    :bt-0-m
    :bt-0-ns
    :bt-l
    :bt-m
    :bt-ns
    :button-reset::-moz-focus-inner
    :bw0
    :bw0-l
    :bw0-m
    :bw0-ns
    :bw1
    :bw1-l
    :bw1-m
    :bw1-ns
    :bw2
    :bw2-l
    :bw2-m
    :bw2-ns
    :bw3
    :bw3-l
    :bw3-m
    :bw3-ns
    :bw4
    :bw4-l
    :bw4-m
    :bw4-ns
    :bw5
    :bw5-l
    :bw5-m
    :bw5-ns
    :calisto
    :cb
    :cb-l
    :cb-m
    :cb-ns
    :center
    :center-l
    :center-m
    :center-ns
    :cf
    :cf:after
    :cf:before
    :child
    :cl
    :cl-l
    :cl-m
    :cl-ns
    :clip
    :clip-l
    :clip-m
    :clip-ns
    :cn
    :cn-l
    :cn-m
    :cn-ns
    :code
    :collapse
    :color-inherit
    :contain
    :contain-l
    :contain-m
    :contain-ns
    :content-around
    :content-around-l
    :content-around-m
    :content-around-ns
    :content-between
    :content-between-l
    :content-between-m
    :content-between-ns
    :content-center
    :content-center-l
    :content-center-m
    :content-center-ns
    :content-end
    :content-end-l
    :content-end-m
    :content-end-ns
    :content-start
    :content-start-l
    :content-start-m
    :content-start-ns
    :content-stretch
    :content-stretch-l
    :content-stretch-m
    :content-stretch-ns
    :courier
    :cover
    :cover-l
    :cover-m
    :cover-ns
    :cr
    :cr-l
    :cr-m
    :cr-ns
    :dark-blue
    :dark-gray
    :dark-green
    :dark-pink
    :dark-red
    :db
    :db-l
    :db-m
    :db-ns
    :debug
    :debug-black
    :debug-grid
    :debug-grid-16
    :debug-grid-16-solid
    :debug-grid-8-solid
    :debug-white
    :di
    :di-l
    :di-m
    :di-ns
    :dib
    :dib-l
    :dib-m
    :dib-ns
    :dim
    :dim:active
    :dim:focus
    :dim:hover
    :dit
    :dit-l
    :dit-m
    :dit-ns
    :dn
    :dn-l
    :dn-m
    :dn-ns
    :dt
    :dt--fixed
    :dt--fixed-l
    :dt--fixed-m
    :dt--fixed-ns
    :dt-column
    :dt-column-group
    :dt-column-group-l
    :dt-column-group-m
    :dt-column-group-ns
    :dt-column-l
    :dt-column-m
    :dt-column-ns
    :dt-l
    :dt-m
    :dt-ns
    :dt-row
    :dt-row-group
    :dt-row-group-l
    :dt-row-group-m
    :dt-row-group-ns
    :dt-row-l
    :dt-row-m
    :dt-row-ns
    :dtc
    :dtc-l
    :dtc-m
    :dtc-ns
    :f-5
    :f-5-l
    :f-5-m
    :f-5-ns
    :f-6
    :f-6-l
    :f-6-m
    :f-6-ns
    :f-headline
    :f-headline-l
    :f-headline-m
    :f-headline-ns
    :f-subheadline
    :f-subheadline-l
    :f-subheadline-m
    :f-subheadline-ns
    :f1
    :f1-l
    :f1-m
    :f1-ns
    :f2
    :f2-l
    :f2-m
    :f2-ns
    :f3
    :f3-l
    :f3-m
    :f3-ns
    :f4
    :f4-l
    :f4-m
    :f4-ns
    :f5
    :f5-l
    :f5-m
    :f5-ns
    :f6
    :f6-l
    :f6-m
    :f6-ns
    :f7
    :f7-l
    :f7-m
    :f7-ns
    :fixed
    :fixed-l
    :fixed-m
    :fixed-ns
    :fl
    :fl-l
    :fl-m
    :fl-ns
    :flex
    :flex-auto
    :flex-auto-l
    :flex-auto-m
    :flex-auto-ns
    :flex-column
    :flex-column-l
    :flex-column-m
    :flex-column-ns
    :flex-column-reverse
    :flex-column-reverse-l
    :flex-column-reverse-m
    :flex-column-reverse-ns
    :flex-l
    :flex-m
    :flex-none
    :flex-none-l
    :flex-none-m
    :flex-none-ns
    :flex-ns
    :flex-row
    :flex-row-l
    :flex-row-m
    :flex-row-ns
    :flex-row-reverse
    :flex-row-reverse-l
    :flex-row-reverse-m
    :flex-row-reverse-ns
    :flex-wrap
    :flex-wrap-l
    :flex-wrap-m
    :flex-wrap-ns
    :flex-wrap-reverse
    :flex-wrap-reverse-l
    :flex-wrap-reverse-m
    :flex-wrap-reverse-ns
    :fn
    :fn-l
    :fn-m
    :fn-ns
    :fr
    :fr-l
    :fr-m
    :fr-ns
    :fs-normal
    :fs-normal-l
    :fs-normal-m
    :fs-normal-ns
    :fw1
    :fw1-l
    :fw1-m
    :fw1-ns
    :fw2
    :fw2-l
    :fw2-m
    :fw2-ns
    :fw3
    :fw3-l
    :fw3-m
    :fw3-ns
    :fw4
    :fw4-l
    :fw4-m
    :fw4-ns
    :fw5
    :fw5-l
    :fw5-m
    :fw5-ns
    :fw6
    :fw6-l
    :fw6-m
    :fw6-ns
    :fw7
    :fw7-l
    :fw7-m
    :fw7-ns
    :fw8
    :fw8-l
    :fw8-m
    :fw8-ns
    :fw9
    :fw9-l
    :fw9-m
    :fw9-ns
    :garamond
    :georgia
    :glow
    :glow:focus
    :glow:hover
    :gold
    :gray
    :green
    :grow
    :grow-large
    :grow-large:active
    :grow-large:focus
    :grow-large:hover
    :grow:active
    :grow:focus
    :grow:hover
    :h-100
    :h-100-l
    :h-100-m
    :h-100-ns
    :h-25
    :h-25-l
    :h-25-m
    :h-25-ns
    :h-50
    :h-50-l
    :h-50-m
    :h-50-ns
    :h-75
    :h-75-l
    :h-75-m
    :h-75-ns
    :h-auto
    :h-auto-l
    :h-auto-m
    :h-auto-ns
    :h-inherit
    :h-inherit-l
    :h-inherit-m
    :h-inherit-ns
    :h1
    :h1-l
    :h1-m
    :h1-ns
    :h2
    :h2-l
    :h2-m
    :h2-ns
    :h3
    :h3-l
    :h3-m
    :h3-ns
    :h4
    :h4-l
    :h4-m
    :h4-ns
    :h5
    :h5-l
    :h5-m
    :h5-ns
    :helvetica
    :hide-child
    :hide-child:active
    :hide-child:focus
    :hide-child:hover
    :hot-pink
    :hover-bg-black-10:focus
    :hover-bg-black-10:hover
    :hover-bg-black-20:focus
    :hover-bg-black-20:hover
    :hover-bg-black-30:focus
    :hover-bg-black-30:hover
    :hover-bg-black-40:focus
    :hover-bg-black-40:hover
    :hover-bg-black-50:focus
    :hover-bg-black-50:hover
    :hover-bg-black-60:focus
    :hover-bg-black-60:hover
    :hover-bg-black-70:focus
    :hover-bg-black-70:hover
    :hover-bg-black-80:focus
    :hover-bg-black-80:hover
    :hover-bg-black-90:focus
    :hover-bg-black-90:hover
    :hover-bg-black:focus
    :hover-bg-black:hover
    :hover-bg-blue:focus
    :hover-bg-blue:hover
    :hover-bg-dark-blue:focus
    :hover-bg-dark-blue:hover
    :hover-bg-dark-gray:focus
    :hover-bg-dark-gray:hover
    :hover-bg-dark-green:focus
    :hover-bg-dark-green:hover
    :hover-bg-dark-pink:focus
    :hover-bg-dark-pink:hover
    :hover-bg-dark-red:focus
    :hover-bg-dark-red:hover
    :hover-bg-gold:focus
    :hover-bg-gold:hover
    :hover-bg-gray:focus
    :hover-bg-gray:hover
    :hover-bg-green:focus
    :hover-bg-green:hover
    :hover-bg-hot-pink:focus
    :hover-bg-hot-pink:hover
    :hover-bg-inherit:focus
    :hover-bg-inherit:hover
    :hover-bg-light-blue:focus
    :hover-bg-light-blue:hover
    :hover-bg-light-gray:focus
    :hover-bg-light-gray:hover
    :hover-bg-light-green:focus
    :hover-bg-light-green:hover
    :hover-bg-light-pink:focus
    :hover-bg-light-pink:hover
    :hover-bg-light-purple:focus
    :hover-bg-light-purple:hover
    :hover-bg-light-red:focus
    :hover-bg-light-red:hover
    :hover-bg-light-silver:focus
    :hover-bg-light-silver:hover
    :hover-bg-light-yellow:focus
    :hover-bg-light-yellow:hover
    :hover-bg-lightest-blue:focus
    :hover-bg-lightest-blue:hover
    :hover-bg-mid-gray:hover
    :hover-bg-moon-gray:focus
    :hover-bg-moon-gray:hover
    :hover-bg-navy:focus
    :hover-bg-navy:hover
    :hover-bg-near-black:focus
    :hover-bg-near-black:hover
    :hover-bg-near-white:focus
    :hover-bg-near-white:hover
    :hover-bg-orange:focus
    :hover-bg-orange:hover
    :hover-bg-pink:focus
    :hover-bg-pink:hover
    :hover-bg-purple:focus
    :hover-bg-purple:hover
    :hover-bg-red:focus
    :hover-bg-red:hover
    :hover-bg-silver:focus
    :hover-bg-silver:hover
    :hover-bg-transparent:focus
    :hover-bg-transparent:hover
    :hover-bg-washed-blue:focus
    :hover-bg-washed-blue:hover
    :hover-bg-washed-green:focus
    :hover-bg-washed-green:hover
    :hover-bg-washed-red:focus
    :hover-bg-washed-red:hover
    :hover-bg-washed-yellow:focus
    :hover-bg-washed-yellow:hover
    :hover-bg-white-10:focus
    :hover-bg-white-10:hover
    :hover-bg-white-20:focus
    :hover-bg-white-20:hover
    :hover-bg-white-30:focus
    :hover-bg-white-30:hover
    :hover-bg-white-40:focus
    :hover-bg-white-40:hover
    :hover-bg-white-50:focus
    :hover-bg-white-50:hover
    :hover-bg-white-60:focus
    :hover-bg-white-60:hover
    :hover-bg-white-70:focus
    :hover-bg-white-70:hover
    :hover-bg-white-80:focus
    :hover-bg-white-80:hover
    :hover-bg-white-90:focus
    :hover-bg-white-90:hover
    :hover-bg-white:focus
    :hover-bg-white:hover
    :hover-bg-yellow:focus
    :hover-bg-yellow:hover
    :hover-black-10:focus
    :hover-black-10:hover
    :hover-black-20:focus
    :hover-black-20:hover
    :hover-black-30:focus
    :hover-black-30:hover
    :hover-black-40:focus
    :hover-black-40:hover
    :hover-black-50:focus
    :hover-black-50:hover
    :hover-black-60:focus
    :hover-black-60:hover
    :hover-black-70:focus
    :hover-black-70:hover
    :hover-black-80:focus
    :hover-black-80:hover
    :hover-black-90:focus
    :hover-black-90:hover
    :hover-black:focus
    :hover-black:hover
    :hover-blue:focus
    :hover-blue:hover
    :hover-dark-blue:focus
    :hover-dark-blue:hover
    :hover-dark-gray:focus
    :hover-dark-gray:hover
    :hover-dark-green:focus
    :hover-dark-green:hover
    :hover-dark-pink:focus
    :hover-dark-pink:hover
    :hover-dark-red:focus
    :hover-dark-red:hover
    :hover-gold:focus
    :hover-gold:hover
    :hover-gray:focus
    :hover-gray:hover
    :hover-green:focus
    :hover-green:hover
    :hover-hot-pink:focus
    :hover-hot-pink:hover
    :hover-inherit:focus
    :hover-inherit:hover
    :hover-light-blue:focus
    :hover-light-blue:hover
    :hover-light-gray:focus
    :hover-light-gray:hover
    :hover-light-green:focus
    :hover-light-green:hover
    :hover-light-pink:focus
    :hover-light-pink:hover
    :hover-light-purple:focus
    :hover-light-purple:hover
    :hover-light-red:focus
    :hover-light-red:hover
    :hover-light-silver:focus
    :hover-light-silver:hover
    :hover-light-yellow:focus
    :hover-light-yellow:hover
    :hover-lightest-blue:focus
    :hover-lightest-blue:hover
    :hover-mid-gray:focus
    :hover-mid-gray:hover
    :hover-moon-gray:focus
    :hover-moon-gray:hover
    :hover-navy:focus
    :hover-navy:hover
    :hover-near-black:focus
    :hover-near-black:hover
    :hover-near-white:focus
    :hover-near-white:hover
    :hover-orange:focus
    :hover-orange:hover
    :hover-pink:focus
    :hover-pink:hover
    :hover-purple:focus
    :hover-purple:hover
    :hover-red:focus
    :hover-red:hover
    :hover-silver:focus
    :hover-silver:hover
    :hover-washed-blue:focus
    :hover-washed-blue:hover
    :hover-washed-green:focus
    :hover-washed-green:hover
    :hover-washed-red:focus
    :hover-washed-red:hover
    :hover-washed-yellow:focus
    :hover-washed-yellow:hover
    :hover-white-10:focus
    :hover-white-10:hover
    :hover-white-20:focus
    :hover-white-20:hover
    :hover-white-30:focus
    :hover-white-30:hover
    :hover-white-40:focus
    :hover-white-40:hover
    :hover-white-50:focus
    :hover-white-50:hover
    :hover-white-60:focus
    :hover-white-60:hover
    :hover-white-70:focus
    :hover-white-70:hover
    :hover-white-80:focus
    :hover-white-80:hover
    :hover-white-90:focus
    :hover-white-90:hover
    :hover-white:focus
    :hover-white:hover
    :hover-yellow:focus
    :hover-yellow:hover
    :i
    :i-l
    :i-m
    :i-ns
    :indent
    :indent-l
    :indent-m
    :indent-ns
    :inline-flex
    :inline-flex-l
    :inline-flex-m
    :inline-flex-ns
    :input-reset
    :input-reset::-moz-focus-inner
    :items-baseline
    :items-baseline-l
    :items-baseline-m
    :items-baseline-ns
    :items-center
    :items-center-l
    :items-center-m
    :items-center-ns
    :items-end
    :items-end-l
    :items-end-m
    :items-end-ns
    :items-start
    :items-start-l
    :items-start-m
    :items-start-ns
    :items-stretch
    :items-stretch-l
    :items-stretch-m
    :items-stretch-ns
    :justify-around
    :justify-around-l
    :justify-around-m
    :justify-around-ns
    :justify-between
    :justify-between-l
    :justify-between-m
    :justify-between-ns
    :justify-center
    :justify-center-l
    :justify-center-m
    :justify-center-ns
    :justify-end
    :justify-end-l
    :justify-end-m
    :justify-end-ns
    :justify-start
    :justify-start-l
    :justify-start-m
    :justify-start-ns
    :left--1
    :left--1-l
    :left--1-m
    :left--1-ns
    :left--2
    :left--2-l
    :left--2-m
    :left--2-ns
    :left-0
    :left-0-l
    :left-0-m
    :left-0-ns
    :left-1
    :left-1-l
    :left-1-m
    :left-1-ns
    :left-2
    :left-2-l
    :left-2-m
    :left-2-ns
    :lh-copy
    :lh-copy-l
    :lh-copy-m
    :lh-copy-ns
    :lh-solid
    :lh-solid-l
    :lh-solid-m
    :lh-solid-ns
    :lh-title
    :lh-title-l
    :lh-title-m
    :lh-title-ns
    :light-blue
    :light-gray
    :light-green
    :light-pink
    :light-purple
    :light-red
    :light-silver
    :light-yellow
    :lightest-blue
    :link
    :link:active
    :link:focus
    :link:hover
    :link:link
    :link:visited
    :list
    :ma0
    :ma0-l
    :ma0-m
    :ma0-ns
    :ma1
    :ma1-l
    :ma1-m
    :ma1-ns
    :ma2
    :ma2-l
    :ma2-m
    :ma2-ns
    :ma3
    :ma3-l
    :ma3-m
    :ma3-ns
    :ma4
    :ma4-l
    :ma4-m
    :ma4-ns
    :ma5
    :ma5-l
    :ma5-m
    :ma5-ns
    :ma6
    :ma6-l
    :ma6-m
    :ma6-ns
    :ma7
    :ma7-l
    :ma7-m
    :ma7-ns
    :mb0
    :mb0-l
    :mb0-m
    :mb0-ns
    :mb1
    :mb1-l
    :mb1-m
    :mb1-ns
    :mb2
    :mb2-l
    :mb2-m
    :mb2-ns
    :mb3
    :mb3-l
    :mb3-m
    :mb3-ns
    :mb4
    :mb4-l
    :mb4-m
    :mb4-ns
    :mb5
    :mb5-l
    :mb5-m
    :mb5-ns
    :mb6
    :mb6-l
    :mb6-m
    :mb6-ns
    :mb7
    :mb7-l
    :mb7-m
    :mb7-ns
    :measure
    :measure-l
    :measure-m
    :measure-narrow
    :measure-narrow-l
    :measure-narrow-m
    :measure-narrow-ns
    :measure-ns
    :measure-wide
    :measure-wide-l
    :measure-wide-m
    :measure-wide-ns
    :mh0
    :mh0-l
    :mh0-m
    :mh0-ns
    :mh1
    :mh1-l
    :mh1-m
    :mh1-ns
    :mh2
    :mh2-l
    :mh2-m
    :mh2-ns
    :mh3
    :mh3-l
    :mh3-m
    :mh3-ns
    :mh4
    :mh4-l
    :mh4-m
    :mh4-ns
    :mh5
    :mh5-l
    :mh5-m
    :mh5-ns
    :mh6
    :mh6-l
    :mh6-m
    :mh6-ns
    :mh7
    :mh7-l
    :mh7-m
    :mh7-ns
    :mid-gray
    :min-h-100
    :min-h-100-l
    :min-h-100-m
    :min-h-100-ns
    :min-vh-100
    :min-vh-100-l
    :min-vh-100-m
    :min-vh-100-ns
    :ml0
    :ml0-l
    :ml0-m
    :ml0-ns
    :ml1
    :ml1-l
    :ml1-m
    :ml1-ns
    :ml2
    :ml2-l
    :ml2-m
    :ml2-ns
    :ml3
    :ml3-l
    :ml3-m
    :ml3-ns
    :ml4
    :ml4-l
    :ml4-m
    :ml4-ns
    :ml5
    :ml5-l
    :ml5-m
    :ml5-ns
    :ml6
    :ml6-l
    :ml6-m
    :ml6-ns
    :ml7
    :ml7-l
    :ml7-m
    :ml7-ns
    :moon-gray
    :mr0
    :mr0-l
    :mr0-m
    :mr0-ns
    :mr1
    :mr1-l
    :mr1-m
    :mr1-ns
    :mr2
    :mr2-l
    :mr2-m
    :mr2-ns
    :mr3
    :mr3-l
    :mr3-m
    :mr3-ns
    :mr4
    :mr4-l
    :mr4-m
    :mr4-ns
    :mr5
    :mr5-l
    :mr5-m
    :mr5-ns
    :mr6
    :mr6-l
    :mr6-m
    :mr6-ns
    :mr7
    :mr7-l
    :mr7-m
    :mr7-ns
    :mt0
    :mt0-l
    :mt0-m
    :mt0-ns
    :mt1
    :mt1-l
    :mt1-m
    :mt1-ns
    :mt2
    :mt2-l
    :mt2-m
    :mt2-ns
    :mt3
    :mt3-l
    :mt3-m
    :mt3-ns
    :mt4
    :mt4-l
    :mt4-m
    :mt4-ns
    :mt5
    :mt5-l
    :mt5-m
    :mt5-ns
    :mt6
    :mt6-l
    :mt6-m
    :mt6-ns
    :mt7
    :mt7-l
    :mt7-m
    :mt7-ns
    :mv0
    :mv0-l
    :mv0-m
    :mv0-ns
    :mv1
    :mv1-l
    :mv1-m
    :mv1-ns
    :mv2
    :mv2-l
    :mv2-m
    :mv2-ns
    :mv3
    :mv3-l
    :mv3-m
    :mv3-ns
    :mv4
    :mv4-l
    :mv4-m
    :mv4-ns
    :mv5
    :mv5-l
    :mv5-m
    :mv5-ns
    :mv6
    :mv6-l
    :mv6-m
    :mv6-ns
    :mv7
    :mv7-l
    :mv7-m
    :mv7-ns
    :mw-100
    :mw-100-l
    :mw-100-m
    :mw-100-ns
    :mw-none
    :mw-none-l
    :mw-none-m
    :mw-none-ns
    :mw1
    :mw1-l
    :mw1-m
    :mw1-ns
    :mw2
    :mw2-l
    :mw2-m
    :mw2-ns
    :mw3
    :mw3-l
    :mw3-m
    :mw3-ns
    :mw4
    :mw4-l
    :mw4-m
    :mw4-ns
    :mw5
    :mw5-l
    :mw5-m
    :mw5-ns
    :mw6
    :mw6-l
    :mw6-m
    :mw6-ns
    :mw7
    :mw7-l
    :mw7-m
    :mw7-ns
    :mw8
    :mw8-l
    :mw8-m
    :mw8-ns
    :mw9
    :mw9-l
    :mw9-m
    :mw9-ns
    :na1
    :na1-l
    :na1-m
    :na1-ns
    :na2
    :na2-l
    :na2-m
    :na2-ns
    :na3
    :na3-l
    :na3-m
    :na3-ns
    :na4
    :na4-l
    :na4-m
    :na4-ns
    :na5
    :na5-l
    :na5-m
    :na5-ns
    :na6
    :na6-l
    :na6-m
    :na6-ns
    :na7
    :na7-l
    :na7-m
    :na7-ns
    :navy
    :nb1
    :nb1-l
    :nb1-m
    :nb1-ns
    :nb2
    :nb2-l
    :nb2-m
    :nb2-ns
    :nb3
    :nb3-l
    :nb3-m
    :nb3-ns
    :nb4
    :nb4-l
    :nb4-m
    :nb4-ns
    :nb5
    :nb5-l
    :nb5-m
    :nb5-ns
    :nb6
    :nb6-l
    :nb6-m
    :nb6-ns
    :nb7
    :nb7-l
    :nb7-m
    :nb7-ns
    :near-black
    :near-white
    :nested-copy-indent
    :nested-copy-line-height
    :nested-copy-seperator
    :nested-headline-line-height
    :nested-img
    :nested-links
    :nested-list-reset
    :nl1
    :nl1-l
    :nl1-m
    :nl1-ns
    :nl2
    :nl2-l
    :nl2-m
    :nl2-ns
    :nl3
    :nl3-l
    :nl3-m
    :nl3-ns
    :nl4
    :nl4-l
    :nl4-m
    :nl4-ns
    :nl5
    :nl5-l
    :nl5-m
    :nl5-ns
    :nl6
    :nl6-l
    :nl6-m
    :nl6-ns
    :nl7
    :nl7-l
    :nl7-m
    :nl7-ns
    :no-underline
    :no-underline-l
    :no-underline-m
    :no-underline-ns
    :normal
    :normal-l
    :normal-m
    :normal-ns
    :nowrap
    :nowrap-l
    :nowrap-m
    :nowrap-ns
    :nr1
    :nr1-l
    :nr1-m
    :nr1-ns
    :nr2
    :nr2-l
    :nr2-m
    :nr2-ns
    :nr3
    :nr3-l
    :nr3-m
    :nr3-ns
    :nr4
    :nr4-l
    :nr4-m
    :nr4-ns
    :nr5
    :nr5-l
    :nr5-m
    :nr5-ns
    :nr6
    :nr6-l
    :nr6-m
    :nr6-ns
    :nr7
    :nr7-l
    :nr7-m
    :nr7-ns
    :nt1
    :nt1-l
    :nt1-m
    :nt1-ns
    :nt2
    :nt2-l
    :nt2-m
    :nt2-ns
    :nt3
    :nt3-l
    :nt3-m
    :nt3-ns
    :nt4
    :nt4-l
    :nt4-m
    :nt4-ns
    :nt5
    :nt5-l
    :nt5-m
    :nt5-ns
    :nt6
    :nt6-l
    :nt6-m
    :nt6-ns
    :nt7
    :nt7-l
    :nt7-m
    :nt7-ns
    :o-0
    :o-025
    :o-05
    :o-10
    :o-100
    :o-20
    :o-30
    :o-40
    :o-50
    :o-60
    :o-70
    :o-80
    :o-90
    :orange
    :order-0
    :order-0-l
    :order-0-m
    :order-0-ns
    :order-1
    :order-1-l
    :order-1-m
    :order-1-ns
    :order-2
    :order-2-l
    :order-2-m
    :order-2-ns
    :order-3
    :order-3-l
    :order-3-m
    :order-3-ns
    :order-4
    :order-4-l
    :order-4-m
    :order-4-ns
    :order-5
    :order-5-l
    :order-5-m
    :order-5-ns
    :order-6
    :order-6-l
    :order-6-m
    :order-6-ns
    :order-7
    :order-7-l
    :order-7-m
    :order-7-ns
    :order-8
    :order-8-l
    :order-8-m
    :order-8-ns
    :order-last
    :order-last-l
    :order-last-m
    :order-last-ns
    :outline
    :outline-0
    :outline-0-l
    :outline-0-m
    :outline-0-ns
    :outline-l
    :outline-m
    :outline-ns
    :outline-transparent
    :outline-transparent-l
    :outline-transparent-m
    :outline-transparent-ns
    :overflow-auto
    :overflow-auto-l
    :overflow-auto-m
    :overflow-auto-ns
    :overflow-container
    :overflow-hidden
    :overflow-hidden-l
    :overflow-hidden-m
    :overflow-hidden-ns
    :overflow-scroll
    :overflow-scroll-l
    :overflow-scroll-m
    :overflow-scroll-ns
    :overflow-visible
    :overflow-visible-l
    :overflow-visible-m
    :overflow-visible-ns
    :overflow-x-auto
    :overflow-x-auto-l
    :overflow-x-auto-m
    :overflow-x-auto-ns
    :overflow-x-hidden
    :overflow-x-hidden-l
    :overflow-x-hidden-m
    :overflow-x-hidden-ns
    :overflow-x-scroll
    :overflow-x-scroll-l
    :overflow-x-scroll-m
    :overflow-x-scroll-ns
    :overflow-x-visible
    :overflow-x-visible-l
    :overflow-x-visible-m
    :overflow-x-visible-ns
    :overflow-y-auto
    :overflow-y-auto-l
    :overflow-y-auto-m
    :overflow-y-auto-ns
    :overflow-y-hidden
    :overflow-y-hidden-l
    :overflow-y-hidden-m
    :overflow-y-hidden-ns
    :overflow-y-scroll
    :overflow-y-scroll-l
    :overflow-y-scroll-m
    :overflow-y-scroll-ns
    :overflow-y-visible
    :overflow-y-visible-l
    :overflow-y-visible-m
    :overflow-y-visible-ns
    :pa0
    :pa0-l
    :pa0-m
    :pa0-ns
    :pa1
    :pa1-l
    :pa1-m
    :pa1-ns
    :pa2
    :pa2-l
    :pa2-m
    :pa2-ns
    :pa3
    :pa3-l
    :pa3-m
    :pa3-ns
    :pa4
    :pa4-l
    :pa4-m
    :pa4-ns
    :pa5
    :pa5-l
    :pa5-m
    :pa5-ns
    :pa6
    :pa6-l
    :pa6-m
    :pa6-ns
    :pa7
    :pa7-l
    :pa7-m
    :pa7-ns
    :pb0
    :pb0-l
    :pb0-m
    :pb0-ns
    :pb1
    :pb1-l
    :pb1-m
    :pb1-ns
    :pb2
    :pb2-l
    :pb2-m
    :pb2-ns
    :pb3
    :pb3-l
    :pb3-m
    :pb3-ns
    :pb4
    :pb4-l
    :pb4-m
    :pb4-ns
    :pb5
    :pb5-l
    :pb5-m
    :pb5-ns
    :pb6
    :pb6-l
    :pb6-m
    :pb6-ns
    :pb7
    :pb7-l
    :pb7-m
    :pb7-ns
    :ph0
    :ph0-l
    :ph0-m
    :ph0-ns
    :ph1
    :ph1-l
    :ph1-m
    :ph1-ns
    :ph2
    :ph2-l
    :ph2-m
    :ph2-ns
    :ph3
    :ph3-l
    :ph3-m
    :ph3-ns
    :ph4
    :ph4-l
    :ph4-m
    :ph4-ns
    :ph5
    :ph5-l
    :ph5-m
    :ph5-ns
    :ph6
    :ph6-l
    :ph6-m
    :ph6-ns
    :ph7
    :ph7-l
    :ph7-m
    :ph7-ns
    :pink
    :pl0
    :pl0-l
    :pl0-m
    :pl0-ns
    :pl1
    :pl1-l
    :pl1-m
    :pl1-ns
    :pl2
    :pl2-l
    :pl2-m
    :pl2-ns
    :pl3
    :pl3-l
    :pl3-m
    :pl3-ns
    :pl4
    :pl4-l
    :pl4-m
    :pl4-ns
    :pl5
    :pl5-l
    :pl5-m
    :pl5-ns
    :pl6
    :pl6-l
    :pl6-m
    :pl6-ns
    :pl7
    :pl7-l
    :pl7-m
    :pl7-ns
    :pointer:hover
    :pr0
    :pr0-l
    :pr0-m
    :pr0-ns
    :pr1
    :pr1-l
    :pr1-m
    :pr1-ns
    :pr2
    :pr2-l
    :pr2-m
    :pr2-ns
    :pr3
    :pr3-l
    :pr3-m
    :pr3-ns
    :pr4
    :pr4-l
    :pr4-m
    :pr4-ns
    :pr5
    :pr5-l
    :pr5-m
    :pr5-ns
    :pr6
    :pr6-l
    :pr6-m
    :pr6-ns
    :pr7
    :pr7-l
    :pr7-m
    :pr7-ns
    :pre
    :pre-l
    :pre-m
    :pre-ns
    :pt0
    :pt0-l
    :pt0-m
    :pt0-ns
    :pt1
    :pt1-l
    :pt1-m
    :pt1-ns
    :pt2
    :pt2-l
    :pt2-m
    :pt2-ns
    :pt3
    :pt3-l
    :pt3-m
    :pt3-ns
    :pt4
    :pt4-l
    :pt4-m
    :pt4-ns
    :pt5
    :pt5-l
    :pt5-m
    :pt5-ns
    :pt6
    :pt6-l
    :pt6-m
    :pt6-ns
    :pt7
    :pt7-l
    :pt7-m
    :pt7-ns
    :purple
    :pv0
    :pv0-l
    :pv0-m
    :pv0-ns
    :pv1
    :pv1-l
    :pv1-m
    :pv1-ns
    :pv2
    :pv2-l
    :pv2-m
    :pv2-ns
    :pv3
    :pv3-l
    :pv3-m
    :pv3-ns
    :pv4
    :pv4-l
    :pv4-m
    :pv4-ns
    :pv5
    :pv5-l
    :pv5-m
    :pv5-ns
    :pv6
    :pv6-l
    :pv6-m
    :pv6-ns
    :pv7
    :pv7-l
    :pv7-m
    :pv7-ns
    :red
    :relative
    :relative-l
    :relative-m
    :relative-ns
    :right--1
    :right--1-l
    :right--1-m
    :right--1-ns
    :right--2
    :right--2-l
    :right--2-m
    :right--2-ns
    :right-0
    :right-0-l
    :right-0-m
    :right-0-ns
    :right-1
    :right-1-l
    :right-1-m
    :right-1-ns
    :right-2
    :right-2-l
    :right-2-m
    :right-2-ns
    :rotate-135
    :rotate-135-l
    :rotate-135-m
    :rotate-135-ns
    :rotate-180
    :rotate-180-l
    :rotate-180-m
    :rotate-180-ns
    :rotate-225
    :rotate-225-l
    :rotate-225-m
    :rotate-225-ns
    :rotate-270
    :rotate-270-l
    :rotate-270-m
    :rotate-270-ns
    :rotate-315
    :rotate-315-l
    :rotate-315-m
    :rotate-315-ns
    :rotate-45
    :rotate-45-l
    :rotate-45-m
    :rotate-45-ns
    :rotate-90
    :rotate-90-l
    :rotate-90-m
    :rotate-90-ns
    :sans-serif
    :self-baseline
    :self-baseline-l
    :self-baseline-m
    :self-baseline-ns
    :self-center
    :self-center-l
    :self-center-m
    :self-center-ns
    :self-end
    :self-end-l
    :self-end-m
    :self-end-ns
    :self-start
    :self-start-l
    :self-start-m
    :self-start-ns
    :self-stretch
    :self-stretch-l
    :self-stretch-m
    :self-stretch-ns
    :serif
    :shadow-1
    :shadow-1-l
    :shadow-1-m
    :shadow-1-ns
    :shadow-2
    :shadow-2-l
    :shadow-2-m
    :shadow-2-ns
    :shadow-3
    :shadow-3-l
    :shadow-3-m
    :shadow-3-ns
    :shadow-4
    :shadow-4-l
    :shadow-4-m
    :shadow-4-ns
    :shadow-5
    :shadow-5-l
    :shadow-5-m
    :shadow-5-ns
    :shadow-hover
    :shadow-hover::after
    :shadow-hover:focus::after
    :shadow-hover:hover::after
    :silver
    :small-caps
    :small-caps-l
    :small-caps-m
    :small-caps-ns
    :static
    :static-l
    :static-m
    :static-ns
    :strike
    :strike-l
    :strike-m
    :strike-ns
    :stripe-dark:nth-child(odd)
    :stripe-light:nth-child(odd)
    :striped--light-gray:nth-child(odd)
    :striped--light-silver:nth-child(odd)
    :striped--moon-gray:nth-child(odd)
    :striped--near-white:nth-child(odd)
    :system-sans-serif
    :system-serif
    :tc
    :tc-l
    :tc-m
    :tc-ns
    :times
    :tl
    :tl-l
    :tl-m
    :tl-ns
    :top--1
    :top--1-l
    :top--1-m
    :top--1-ns
    :top--2
    :top--2-l
    :top--2-m
    :top--2-ns
    :top-0
    :top-0-l
    :top-0-m
    :top-0-ns
    :top-1
    :top-1-l
    :top-1-m
    :top-1-ns
    :top-2
    :top-2-l
    :top-2-m
    :top-2-ns
    :tr
    :tr-l
    :tr-m
    :tr-ns
    :tracked
    :tracked-l
    :tracked-m
    :tracked-mega
    :tracked-mega-l
    :tracked-mega-m
    :tracked-mega-ns
    :tracked-ns
    :tracked-tight
    :tracked-tight-l
    :tracked-tight-m
    :tracked-tight-ns
    :truncate
    :truncate-l
    :truncate-m
    :truncate-ns
    :ttc
    :ttc-l
    :ttc-m
    :ttc-ns
    :ttl
    :ttl-l
    :ttl-m
    :ttl-ns
    :ttn
    :ttn-l
    :ttn-m
    :ttn-ns
    :ttu
    :ttu-l
    :ttu-m
    :ttu-ns
    :underline
    :underline-hover:focus
    :underline-hover:hover
    :underline-l
    :underline-m
    :underline-ns
    :v-base
    :v-base-l
    :v-base-m
    :v-base-ns
    :v-btm
    :v-btm-l
    :v-btm-m
    :v-btm-ns
    :v-mid
    :v-mid-l
    :v-mid-m
    :v-mid-ns
    :v-top
    :v-top-l
    :v-top-m
    :v-top-ns
    :vh-100
    :vh-100-l
    :vh-100-m
    :vh-100-ns
    :vh-25
    :vh-25-l
    :vh-25-m
    :vh-25-ns
    :vh-50
    :vh-50-l
    :vh-50-m
    :vh-50-ns
    :vh-75
    :vh-75-l
    :vh-75-m
    :vh-75-ns
    :w-10
    :w-10-l
    :w-10-m
    :w-10-ns
    :w-100
    :w-100-l
    :w-100-m
    :w-100-ns
    :w-20
    :w-20-l
    :w-20-m
    :w-20-ns
    :w-25
    :w-25-l
    :w-25-m
    :w-25-ns
    :w-30
    :w-30-l
    :w-30-m
    :w-30-ns
    :w-33
    :w-33-l
    :w-33-m
    :w-33-ns
    :w-34
    :w-34-l
    :w-34-m
    :w-34-ns
    :w-40
    :w-40-l
    :w-40-m
    :w-40-ns
    :w-50
    :w-50-l
    :w-50-m
    :w-50-ns
    :w-60
    :w-60-l
    :w-60-m
    :w-60-ns
    :w-70
    :w-70-l
    :w-70-m
    :w-70-ns
    :w-75
    :w-75-l
    :w-75-m
    :w-75-ns
    :w-80
    :w-80-l
    :w-80-m
    :w-80-ns
    :w-90
    :w-90-l
    :w-90-m
    :w-90-ns
    :w-auto
    :w-auto-l
    :w-auto-m
    :w-auto-ns
    :w-third
    :w-third-l
    :w-third-m
    :w-third-ns
    :w-two-thirds
    :w-two-thirds-l
    :w-two-thirds-m
    :w-two-thirds-ns
    :w1
    :w1-l
    :w1-m
    :w1-ns
    :w2
    :w2-l
    :w2-m
    :w2-ns
    :w3
    :w3-l
    :w3-m
    :w3-ns
    :w4
    :w4-l
    :w4-m
    :w4-ns
    :w5
    :w5-l
    :w5-m
    :w5-ns
    :washed-blue
    :washed-green
    :washed-red
    :washed-yellow
    :white
    :white-10
    :white-20
    :white-30
    :white-40
    :white-50
    :white-60
    :white-70
    :white-80
    :white-90
    :ws-normal
    :ws-normal-l
    :ws-normal-m
    :ws-normal-ns
    :yellow
    :z-0
    :z-1
    :z-2
    :z-3
    :z-4
    :z-5
    :z-999
    :z-9999
    :z-inherit
    :z-initial
    :z-max
    :z-unset})
