(ns planck.bundle
  "Require namespaces so they will be bundled in the Planck binary."
  (:require
   [google-closure-compiler-js]
   [cljs.analyzer.api]
   [cljs.pprint]
   [cljs.spec.alpha]
   [cljs.spec.test.alpha]
   [cljs.test]
   [clojure.core.reducers]
   [clojure.data]
   [clojure.zip]
   [fipp.clojure]
   [fipp.deque]
   [fipp.edn]
   [fipp.ednize]
   [fipp.engine]
   [fipp.visit]
   [goog.Delay]
   [goog.Disposable]
   [goog.Promise]
   [goog.Throttle]
   [goog.Timer]
   [goog.Uri]
   [goog.color]
   [goog.color.Hsl]
   [goog.color.Hsv]
   [goog.color.Rgb]
   [goog.color.alpha]
   [goog.color.names]
   [goog.crypt]
   [goog.crypt.Aes]
   [goog.crypt.Arc4]
   [goog.crypt.BlobHasher]
   [goog.crypt.Cbc]
   [goog.crypt.Hash]
   [goog.crypt.Hmac]
   [goog.crypt.Md5]
   [goog.crypt.Sha1]
   [goog.crypt.Sha2]
   [goog.crypt.Sha224]
   [goog.crypt.Sha256]
   [goog.crypt.Sha2_64bit]
   [goog.crypt.Sha512]
   [goog.crypt.Sha512_256]
   [goog.crypt.base64]
   [goog.crypt.baseN]
   [goog.crypt.hash32]
   [goog.crypt.hashTester]
   [goog.crypt.pbkdf2]
   [goog.date.Date]
   [goog.date.DateLike]
   [goog.date.DateRange]
   [goog.date.DateTime]
   [goog.date.Interval]
   [goog.date.UtcDateTime]
   [goog.date.duration]
   [goog.date.month]
   [goog.date.relative.TimeDeltaFormatter]
   [goog.date.relative.Unit]
   [goog.date.relativeWithPlurals]
   [goog.date.weekDay]
   [goog.debug.Console]
   [goog.format]
   [goog.format.EmailAddress]
   [goog.format.HtmlPrettyPrinter]
   [goog.format.InternationalizedEmailAddress]
   [goog.format.JsonPrettyPrinter]
   [goog.i18n.BidiFormatter]
   [goog.i18n.CharListDecompressor]
   [goog.i18n.CharPickerData]
   [goog.i18n.DateTimeFormat]
   [goog.i18n.DateTimeParse]
   [goog.i18n.GraphemeBreak]
   [goog.i18n.MessageFormat]
   [goog.i18n.NumberFormat]
   [goog.i18n.TimeZone]
   [goog.i18n.bidi]
   [goog.i18n.bidi.Dir]
   [goog.i18n.bidi.Format]
   [goog.i18n.collation]
   [goog.i18n.currency]
   [goog.i18n.mime]
   [goog.i18n.ordinalRules]
   [goog.i18n.pluralRules]
   [goog.i18n.uChar]
   [goog.i18n.uChar.LocalNameFetcher]
   [goog.i18n.uChar.RemoteNameFetcher]
   [goog.i18n.uCharNames]
   [goog.iter]
   [goog.iter.Iterable]
   [goog.iter.Iterator]
   [goog.json]
   [goog.json.EvalJsonProcessor]
   [goog.json.NativeJsonProcessor]
   [goog.json.Replacer]
   [goog.json.Reviver]
   [goog.json.Serializer]
   [goog.json.hybrid]
   [goog.labs.format.csv]
   [goog.locale]
   [goog.locale.TimeZoneFingerprint]
   [goog.locale.defaultLocaleNameConstants]
   [goog.locale.genericFontNames]
   [goog.locale.timeZoneDetection]
   [goog.math]
   [goog.math.AffineTransform]
   [goog.math.Bezier]
   [goog.math.Box]
   [goog.math.Coordinate]
   [goog.math.Coordinate3]
   [goog.math.ExponentialBackoff]
   [goog.math.Integer]
   [goog.math.Line]
   [goog.math.Long]
   [goog.math.Matrix]
   [goog.math.Path]
   [goog.math.Path.Segment]
   [goog.math.Range]
   [goog.math.RangeSet]
   [goog.math.Rect]
   [goog.math.Size]
   [goog.math.Vec2]
   [goog.math.Vec3]
   [goog.math.interpolator.Linear1]
   [goog.math.interpolator.Pchip1]
   [goog.math.interpolator.Spline1]
   [goog.math.paths]
   [goog.math.tdma]
   [goog.spell.SpellCheck]
   [goog.string]
   [goog.string.Const]
   [goog.string.StringBuffer]
   [goog.string.Unicode]
   [goog.string.format]
   [goog.string.newlines]
   [goog.string.newlines.Line]
   [goog.structs]
   [goog.structs.AvlTree]
   [goog.structs.AvlTree.Node]
   [goog.structs.CircularBuffer]
   [goog.structs.Heap]
   [goog.structs.InversionMap]
   [goog.structs.LinkedMap]
   [goog.structs.Map]
   [goog.structs.Node]
   [goog.structs.Pool]
   [goog.structs.PriorityPool]
   [goog.structs.PriorityQueue]
   [goog.structs.QuadTree]
   [goog.structs.QuadTree.Node]
   [goog.structs.QuadTree.Point]
   [goog.structs.Queue]
   [goog.structs.Set]
   [goog.structs.SimplePool]
   [goog.structs.StringSet]
   [goog.structs.TreeNode]
   [goog.structs.Trie]
   [goog.text.LoremIpsum]))
