var _0xa990=['../devtools-panel/devtools-content.html','inspectedWindow','devtools-page','extension','addListener','ChroPath','onHidden','createSidebarPane','sendMessage','panels','devtools','runtime','connect','tabId','xpath','generate-selector','setPage','onShown'];(function(_0x22c8c0,_0xa990e6){var _0x23ca62=function(_0x20f663){while(--_0x20f663){_0x22c8c0['push'](_0x22c8c0['shift']());}};_0x23ca62(++_0xa990e6);}(_0xa990,0xf6));var _0x23ca=function(_0x22c8c0,_0xa990e6){_0x22c8c0=_0x22c8c0-0x0;var _0x23ca62=_0xa990[_0x22c8c0];return _0x23ca62;};var backgroundPageConnection=chrome[_0x23ca('0x11')][_0x23ca('0x0')]({'name':_0x23ca('0x8')});chrome[_0x23ca('0x10')][_0x23ca('0xf')]['elements'][_0x23ca('0xd')](_0x23ca('0xb'),function(_0x1ebe9f){_0x1ebe9f[_0x23ca('0x4')](_0x23ca('0x6'));_0x1ebe9f[_0x23ca('0x5')][_0x23ca('0xa')](handleShown);_0x1ebe9f[_0x23ca('0xc')]['addListener'](handleHidden);});function handleShown(){chrome[_0x23ca('0x9')][_0x23ca('0xe')]({'message':_0x23ca('0x3')});}function handleHidden(){var _0x29e080=_0x23ca('0x2');var _0x3690f1=![];var _0x30cb76=[_0x29e080,'',_0x3690f1];backgroundPageConnection['postMessage']({'name':'highlight-element','tabId':chrome[_0x23ca('0x10')][_0x23ca('0x7')][_0x23ca('0x1')],'xpath':_0x30cb76});}