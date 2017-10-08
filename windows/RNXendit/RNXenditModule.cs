using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Xendit.RNXendit
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNXenditModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNXenditModule"/>.
        /// </summary>
        internal RNXenditModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNXendit";
            }
        }
    }
}
